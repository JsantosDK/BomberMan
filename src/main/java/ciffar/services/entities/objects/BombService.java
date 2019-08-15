package ciffar.services.entities.objects;

public class BombService extends AbstractObjectService {

    public BombService(float x, float y) {
        super(x, y);
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }
}
