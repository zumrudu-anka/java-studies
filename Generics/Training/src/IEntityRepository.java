public interface IEntityRepository<Type extends IEntity > {
    void add(Type entity);
    void delete(Type entity);
    void update(Type entity);
}
