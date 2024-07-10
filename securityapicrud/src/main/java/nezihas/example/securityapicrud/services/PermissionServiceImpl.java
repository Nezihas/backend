package nezihas.example.securityapicrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nezihas.example.securityapicrud.entity.Permissions;
import nezihas.example.securityapicrud.repository.PermissionRepository;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permissions> getAllPermissions() {
        return permissionRepository.findAll();
    }

    @Override
    public Permissions getPermissionById(Long id) {
        return permissionRepository.findById(id).orElse(null);
    }

    @Override
    public Permissions createPermission(Permissions permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public Permissions updatePermission(Long id, Permissions permission) {
        Permissions existingPermission = permissionRepository.findById(id).orElse(null);
        if (existingPermission != null) {
            existingPermission.setIdEmployee(permission.getIdEmployee());
            existingPermission.setCommentaire(permission.getCommentaire());
            existingPermission.setDate(permission.getDate());
            existingPermission.setStatut(permission.getStatut());
            return permissionRepository.save(existingPermission);
        }
        return null;
    }

    @Override
    public void deletePermission(Long id) {
        permissionRepository.deleteById(id);
    }

}
