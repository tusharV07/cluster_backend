package com.mycomp.clusterportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.clusterportal.entity.Cluster;
import com.mycomp.clusterportal.repository.ClusterRepository;

@RestController
@RequestMapping("/api/clusters")
public class ClusterController {
  @Autowired
  private ClusterRepository repo;

  @GetMapping
  public List<Cluster> list() {
    return repo.findAll();
  }

  @PutMapping("/{id}")
  @PreAuthorize("hasRole('ADMIN')")
  public Cluster update(@PathVariable Long id, @RequestBody Cluster c) {
    Cluster cluster = repo.findById(id).orElseThrow();
    cluster.setServerCount(c.getServerCount());
    return repo.save(cluster);
  }
}
