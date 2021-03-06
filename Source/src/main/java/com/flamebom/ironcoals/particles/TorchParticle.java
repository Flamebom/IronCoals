package com.flamebom.ironcoals.particles;

import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.world.ClientWorld;

public class TorchParticle extends SpriteTexturedParticle {
    public TorchParticle(ClientWorld worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double speedIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, speedIn);
        this.particleRed = 0.67F;
        this.particleGreen = 0.67F;
        this.particleBlue = 0.67F;
        this.setSize(0.02F, 0.02F);
        this.particleScale *= this.rand.nextFloat() * 0.6F + 0.5F;
        this.motionX *= (double) 0.02F;
        this.motionY *= (double) 0.02F;
        this.motionZ *= (double) 0.02F;
        this.maxAge = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
        this.particleAlpha = .8f;
    }

    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public void move(double x, double y, double z) {
        this.setBoundingBox(this.getBoundingBox().offset(x, y, z));
        this.resetPositionToBB();
    }

    public void tick() {
        this.particleRed = 0.67F;
        this.particleGreen = 0.67F;
        this.particleBlue = 0.67F;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.maxAge-- <= 0) {
            this.setExpired();
        } else {
            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.99D;
            this.motionY *=1.05D;
            this.motionZ *= 0.99D;
        }
        
    }
}