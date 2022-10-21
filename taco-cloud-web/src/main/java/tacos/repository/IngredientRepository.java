package tacos.repository;

import tacos.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient save(Ingredient ingredient);

    Ingredient findOne(String id);
}
