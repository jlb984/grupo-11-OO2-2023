package com.grupo11.grupo11OO22023.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.entities.Lugar;

@Repository("dispositivoIOTRepository")
public interface IDispositivoIOTRepository extends JpaRepository<DispositivoIOT, Serializable>{
	 
	public abstract DispositivoIOT findByIdDispositivo(int id);

	public abstract List<DispositivoIOT> findByLugar(Lugar lugar);
}
