package net.mcreator.aggregate.procedures;

@AggregateModElements.ModElement.Tag
public class FlameAxeRightClickedOnBlockProcedure extends AggregateModElements.ModElement {

	public FlameAxeRightClickedOnBlockProcedure(AggregateModElements instance) {
		super(instance, 79);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AggregateMod.LOGGER.warn("Failed to load dependency x for procedure FlameAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AggregateMod.LOGGER.warn("Failed to load dependency y for procedure FlameAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AggregateMod.LOGGER.warn("Failed to load dependency z for procedure FlameAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AggregateMod.LOGGER.warn("Failed to load dependency world for procedure FlameAxeRightClickedOnBlock!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.FIRE.getDefaultState(), 3);
		}

	}

}
