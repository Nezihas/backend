package nezihas.example.securityapicrud.services;

import java.util.List;

import nezihas.example.securityapicrud.entity.Permissions;

public interface PermissionService {
    List<Permissions> getAllPermissions();

    Permissions getPermissionById(Long id);

    Permissions createPermission(Permissions permission);

    Permissions updatePermission(Long id, Permissions permission);

    void deletePermission(Long id);
}
