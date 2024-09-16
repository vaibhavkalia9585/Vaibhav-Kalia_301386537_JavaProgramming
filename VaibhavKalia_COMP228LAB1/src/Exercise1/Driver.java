package Exercise1;

public class Driver {
    public static void main(String[] args) {

        Singer singer1 = new Singer();


        System.out.println("Details of the default singer:");
        System.out.println("Name of the Artist :" + singer1.getName());
        System.out.println("Address of the Artist: " + singer1.getAddress());
        System.out.println("Artist's ID: " + singer1.getId());
        System.out.println("Date of Birth of the Artist: " + singer1.getDateOfBirth());
        System.out.println("Total albums by the Artist: " + singer1.getNumAlbumsPublished());


        singer1.setId(9);
        singer1.setName("Vaibhav Kalia");
        singer1.setAddress("Toronto, ON, CA");
        singer1.setDateOfBirth("Jan 20, 2005");
        singer1.setNumAlbumsPublished(25);

        System.out.println("Name of the Artist : " + singer1.getName());
        System.out.println("Address of the Artist: " + singer1.getAddress());
        System.out.println("Artist's ID: " + singer1.getId());
        System.out.println("Date of Birth of the Artist: " + singer1.getDateOfBirth());
        System.out.println("Total albums by the Artist: " + singer1.getNumAlbumsPublished());
    }
}

