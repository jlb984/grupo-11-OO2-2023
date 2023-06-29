package com.grupo11.grupo11OO22023.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupo11.grupo11OO22023.entities.DispositivoIOT;

@Repository("dispositivoIOTRepository")
public interface IDispositivoIOTRepository extends JpaRepository<DispositivoIOT, Serializable>{

}
