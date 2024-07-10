package nezihas.example.securityapicrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nezihas.example.securityapicrud.entity.Permissions;
import nezihas.example.securityapicrud.services.PermissionService;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @PostMapping
    public Permissions createPermission(@RequestBody Permissions permission) {
        return permissionService.createPermission(permission);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permissions> getPermissionById(@PathVariable Long id) {
        Permissions permission = permissionService.getPermissionById(id);
        if (permission != null) {
            return ResponseEntity.ok(permission);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Permissions> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Permissions> updatePermission(@PathVariable Long id,
            @RequestBody Permissions permissionDetails) {
        Permissions updatedPermission = permissionService.updatePermission(id, permissionDetails);
        if (updatedPermission != null) {
            return ResponseEntity.ok(updatedPermission);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePermission(@PathVariable Long id) {
        permissionService.deletePermission(id);
        return ResponseEntity.noContent().build();
    }
}
