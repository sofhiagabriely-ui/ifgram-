package br.edu.ifpb.ifgram.Repository;

import br.edu.ifpb.ifgram.Model.Follow;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {

    boolean existsBySeguidorIdAndSeguidoId(Long seguidorId, Long seguidoId);

    Optional<Follow> findBySeguidorIdAndSeguidoId(Long seguidorId, Long seguidoId);

    long countBySeguidoId(Long seguidoId);

    long countBySeguidorId(Long seguidorId);

    List<Follow> findBySeguidoId(Long seguidoId);

    List<Follow> findBySeguidorId(Long seguidorId);
}
