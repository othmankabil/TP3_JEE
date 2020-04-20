package EmsiMarrif.G3.hospitalapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import EmsiMarrif.G3.hospitalapp.entities.patient;

public interface PatienRepository
extends JpaRepository<patient, Long>
{

}
