package dao;

public interface Dao<ModelType> {

	// CRUD = Create, Read, Update, Delete

	ModelType create(ModelType modelo);

	ModelType read(Long codigo);

	ModelType update(ModelType modelo);

	ModelType delete(Long codigo);	

}
