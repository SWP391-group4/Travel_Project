/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class RoomImages {
    private String ImageId;
    private String RoomId;

    public RoomImages(String ImageId, String RoomId) {
        this.ImageId = ImageId;
        this.RoomId = RoomId;
    }

    public RoomImages() {
    }

    public String getImageId() {
        return ImageId;
    }

    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    @Override
    public String toString() {
        return "RoomImages{" + "ImageId=" + ImageId + ", RoomId=" + RoomId + '}';
    }
    
}
