package xzj.builder;

import xzj.common.Builder;

//Builder Pattern
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class MyBuilder implements Builder<NutritionFacts>{
		//Required parameters
		private final int servingSize;
		private final int servings;
		
		//optional parameters - initialized to default values
		private int calories =0;
		private int fat =0;
		private int carbohydrate =0;
		private int sodium =0;
		
		public MyBuilder(int servingSize,int servings) {
			this.servings=servings;
			this.servingSize=servings;
		}
		public MyBuilder calories(int val) {
			calories = val;
			return this;
		}
		public MyBuilder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		public MyBuilder sodium(int val) {
			sodium = val;
			return this;
		}
		@Override
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}                        
	
	}
	private NutritionFacts (MyBuilder builder) {
		servings=builder.servings;
		servingSize=builder.servingSize;
		calories=builder.calories;
		fat=builder.fat;
		sodium=builder.sodium;
		carbohydrate=builder.carbohydrate;
	}
	public static void main(String[] args) {
		NutritionFacts nutritionFacts = new NutritionFacts.MyBuilder(3, 3).calories(100).sodium(5).carbohydrate(66).build();
		System.out.println(nutritionFacts);
	}
}
