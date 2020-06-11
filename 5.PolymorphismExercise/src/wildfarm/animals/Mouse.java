package wildfarm.animals;

import wildfarm.food.Food;

public class Mouse extends Mammal {


    public Mouse(String animalName, String animalType,
                 Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if(food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
        }

        setFoodEaten(food.getQuantity());
    }
}