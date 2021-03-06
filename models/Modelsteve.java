// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer cabody;
	private final ModelRenderer cacape;
	private final ModelRenderer carightleg;
	private final ModelRenderer caleftleg;
	private final ModelRenderer caleftarm;
	private final ModelRenderer carightarm;
	private final ModelRenderer cahead;
	private final ModelRenderer wings;
	private final ModelRenderer caleftshoe;
	private final ModelRenderer carightshoe;

	public Modelsteve() {
		textureWidth = 128;
		textureHeight = 128;

		cabody = new ModelRenderer(this);
		cabody.setRotationPoint(0.0F, 0.0F, 0.0F);
		cabody.setTextureOffset(34, 34).addBox(-4.5F, -0.1F, -2.6F, 9.0F, 12.0F, 5.0F, 0.0F, false);
		cabody.setTextureOffset(35, 60).addBox(-4.0F, 1.0F, -3.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		cabody.setTextureOffset(20, 40).addBox(-3.0F, 6.0F, -3.0F, 6.0F, 5.0F, 1.0F, 0.0F, false);

		cacape = new ModelRenderer(this);
		cacape.setRotationPoint(0.0F, 0.0F, 3.0F);
		cabody.addChild(cacape);
		setRotationAngle(cacape, 0.0873F, 0.0F, 0.0F);
		cacape.setTextureOffset(0, 0).addBox(-8.0F, 0.0F, -1.0F, 16.0F, 21.0F, 1.0F, 0.0F, false);

		carightleg = new ModelRenderer(this);
		carightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		carightleg.setTextureOffset(34, 15).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

		caleftleg = new ModelRenderer(this);
		caleftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		caleftleg.setTextureOffset(34, 15).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);

		caleftarm = new ModelRenderer(this);
		caleftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		caleftarm.setTextureOffset(0, 40).addBox(-1.5F, -2.2F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		caleftarm.setTextureOffset(50, 53).addBox(-1.5F, 8.8F, -2.4F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		caleftarm.setTextureOffset(49, 9).addBox(-0.9F, -4.2F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);

		carightarm = new ModelRenderer(this);
		carightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		carightarm.setTextureOffset(0, 40).addBox(-3.5F, -2.2F, -2.5F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		carightarm.setTextureOffset(49, 9).addBox(-5.1F, -4.2F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		carightarm.setTextureOffset(50, 53).addBox(-3.5F, 8.8F, -2.4F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		cahead = new ModelRenderer(this);
		cahead.setRotationPoint(0.0F, 0.0F, 0.0F);
		cahead.setTextureOffset(53, 60).addBox(-4.0F, -7.6F, -4.1F, 8.0F, 7.0F, 0.0F, 0.0F, false);
		cahead.setTextureOffset(0, 22).addBox(-4.5F, -9.6F, -3.3F, 9.0F, 10.0F, 8.0F, 0.0F, false);
		cahead.setTextureOffset(54, 19).addBox(-4.5F, -9.6F, -4.3F, 9.0F, 4.0F, 1.0F, 0.0F, false);
		cahead.setTextureOffset(54, 7).addBox(-4.5F, -0.6F, -4.3F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		cahead.setTextureOffset(57, 34).addBox(0.5F, -4.6F, -4.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		cahead.setTextureOffset(49, 0).addBox(-4.5F, -4.6F, -4.3F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		cahead.setTextureOffset(4, 28).addBox(-4.5F, -5.6F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cahead.setTextureOffset(0, 28).addBox(3.5F, -5.6F, -4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, -7.6F, 1.7F);
		cahead.addChild(wings);
		setRotationAngle(wings, -0.4363F, 0.0F, 0.0F);
		wings.setTextureOffset(6, 55).addBox(4.0F, -4.0F, 1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(0, 55).addBox(-5.0F, -4.0F, 1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		wings.setTextureOffset(0, 22).addBox(4.0F, -4.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(4, 22).addBox(-5.0F, -4.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(4, 22).addBox(4.0F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		wings.setTextureOffset(0, 22).addBox(-5.0F, -2.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		caleftshoe = new ModelRenderer(this);
		caleftshoe.setRotationPoint(2.0F, 12.0F, 0.0F);
		caleftshoe.setTextureOffset(54, 0).addBox(-2.0F, 10.1F, -2.9F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		carightshoe = new ModelRenderer(this);
		carightshoe.setRotationPoint(-2.0F, 12.0F, 0.0F);
		carightshoe.setTextureOffset(54, 0).addBox(-2.0F, 10.1F, -2.9F, 4.0F, 2.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		cabody.render(matrixStack, buffer, packedLight, packedOverlay);
		carightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		caleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		caleftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		carightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		cahead.render(matrixStack, buffer, packedLight, packedOverlay);
		caleftshoe.render(matrixStack, buffer, packedLight, packedOverlay);
		carightshoe.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}