package Aula09;


import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        
        System.out.println("Enter the plane's id: ");
        String id = scanner.next();
        System.out.println("Enter the plane's manufacturer: ");
        String fabricante = scanner.next();
        System.out.println("Enter the plane's model: ");
        String modelo = scanner.next();
        System.out.println("Enter the plane's year of production: ");
        int anoprod = scanner.nextInt();
        System.out.println("Enter the plane's maximum number of passengers: ");
        int numeromaxpass = scanner.nextInt();
        System.out.println("Enter the plane's maximum speed: ");
        int velocmax = scanner.nextInt();
        System.out.println("Enter the plane's type: (1)Commercial or (2)Military or (3)Normal");
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("NumOfCrewMembers?");
            int numOfCrewMembers=scanner.nextInt();
            Plane plane = new CommercialPlane(id, fabricante, modelo, anoprod, numeromaxpass, velocmax,numOfCrewMembers);
            planeManager.addPlane(plane);
            System.out.println("Avião Comercial criado com sucesso");
        }else if(choice==2){
            System.out.println("NumMissiles?");
            int numMissiles=scanner.nextInt();
            Plane plane = new MilitaryPlane(id, fabricante, modelo, anoprod, numeromaxpass, velocmax,numMissiles);
            planeManager.addPlane(plane);
            System.out.println("Avião Militar criado com sucesso");
        }else if(choice==3){
            Plane plane = new Plane(id, fabricante, modelo, anoprod, numeromaxpass, velocmax);
            planeManager.addPlane(plane);
            System.out.println("Avião Normal criado com sucesso");
            
        }
        
    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("Id do avião a remover?");
        String id=scanner.next().trim();
        planeManager.removePlane(id);
        
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        if(planeManager.planes.size()==0){
            System.out.println("Não há aviões registados");
        }else{
            System.out.println("Id  Avião que queres encontrar?");
            String src=scanner.next().trim();
            Plane plane= planeManager.searchPlane(src);
            if(plane!=null){
                System.out.println(plane.toString());
            }else{
                System.out.println("Wrong id ");
            }
        }
        
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        System.out.println();
        System.out.println("All Planes");
        planeManager.printallPlanes();
        System.out.println();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        System.out.println();
        System.out.println("Commercil Planes");
        planeManager.getCommercialPlanes();
        System.out.println();
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        System.out.println();
        System.out.println("Military Planes");
        planeManager.getMilitaryPlanes();
        System.out.println();
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println();
        System.out.println("Fastest plane");
        System.out.println(planeManager.getFastestPlane());
        System.out.println();
    }
}
