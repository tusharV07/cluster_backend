package com.mycomp.clusterportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycomp.clusterportal.entity.Cluster;

public interface ClusterRepository extends JpaRepository<Cluster, Long> {
}
