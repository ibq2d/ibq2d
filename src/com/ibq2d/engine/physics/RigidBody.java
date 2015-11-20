package com.ibq2d.engine.physics;

import com.ibq2d.engine.geometry.*;

public class RigidBody {
    private float mass;
    private Vector2 velocity;
    private Collider collider;

    public RigidBody(float mass, Vector2 velocity, Collider collider) {
        this.mass = mass;
        this.velocity = velocity;
        this.collider = collider;
        collider.rigidBody = this;
    }

    public RigidBody(Collider collider) {
        this.collider = collider;
        this.mass = 1;
        this.velocity = Vector2.zero();
        collider.rigidBody = this;
    }

    public RigidBody(Vector2 velocity, Collider collider) {
        this.mass = 1;
        this.velocity = velocity;
        this.collider = collider;
        collider.rigidBody = this;
    }

    public void update() {
        Vector2 position = Vector2.add(collider.shape.getPosition(), velocity);
        collider.shape.setPosition(position);
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }
}