package br.edu.ifpb.ifgram.Repository;

 public interface UserRepository extends JpaRepository<User, Long>{

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
    List<User> findByNomeContainingIgnoreCase(String trecho);

    @Query("select u from User u where u.email like concat('%', :dominio)")
    List<User> doDominio(String dominio);
