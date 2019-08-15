package ciffar.services.entities.objects;

public class BombService extends AbstractObjectService {

    public BombService(float x, float y) {
        super(x, y);
        collisionBox.setBounds(0,0,25,25);
    }

}
