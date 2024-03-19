package Exercicioanopassado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class EventManager {
    private String Nome;
    private Map<cliente,ArrayList<event>> clientes = new HashMap<cliente,ArrayList<event>>();

    public EventManager(String nome) {
        Nome = nome;
        
    }
    public Map<cliente, ArrayList<event>> getClientes() {
        return clientes;
    }
    public void setClientes(Map<cliente, ArrayList<event>> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public cliente addClient(String  nome,String localidade){
        cliente c=new cliente(nome, localidade);
        ArrayList<event> eventos= new ArrayList<>();
        clientes.put(c,eventos);
        return c;
    }

    public event addEvent(cliente client,LocalDate date){
        event event = new event(date);
        for(cliente key: clientes.keySet()){
            if((key.getNome().equals(client.getNome()) || key.getLocalidade().equals(client.getLocalidade()))){
                clientes.get(key).add(event);
            }else{
                ArrayList<event> eventos = clientes.get(key);
                eventos.add(event);
                clientes.put(key, eventos);
            }
            
        }
        return event;
    }
        
    


    public String listClients(){
        for(cliente key: clientes.keySet()){
            System.out.println(key);
        }
        return "";
    }

        public String listEvents() {
            System.out.println("");
            System.out.println("Eventos:");
            for (cliente i: clientes.keySet()){
                System.out.println(i.toString());
                ArrayList<event> eventos = new ArrayList<>();
                eventos=clientes.get(i);
                for (event f : eventos){
                    System.out.println("*** Evento em "+f.getDate()+", total="+f.totalprice()+" euros");
                    for (atividade h:f.getAtividades()){
                        if(h.getModal().equals("Sport")){
                            String m = h.getModal();
                            switch(m){
                                case "KAYAK":
                                System.out.println("       Kayak sporting activity with "+ h.getParticipant()+" participants");
                                break;
                                    
                                case "BIKE":
                                System.out.println("       Bike sporting activity with "+ h.getParticipant()+" participants");
                                break;
                            }
                        }
                        else {
                            if(h.getModal().equals("Catering")){
                                String m = h.getModal();
                                switch(m){
                                    case "FULL_MENU":
                                    System.out.println("       'Full menu' for "+ h.getParticipant()+" participants");
                                    break;
                                    
                                    case "DRINKS_AND_SNACKS":
                                    System.out.println("       'Drinks and Snaks' for "+ h.getParticipant()+" participants");
                                    break;
                                    
                                    case "LIGHT_BITES":
                                    System.out.println("       'Light bites' for "+ h.getParticipant()+" participants");
                                    break;
    
                                }
                                
                            }
                            else{
                                String m = h.getModal();
                                switch(m){
                                    case "ART_MUSEUM":
                                    System.out.println("       Art museum tour with "+ h.getParticipant()+" participants");
                                    break;
                                    
                                    case "ARCHITECTURAL_TOUR":
                                    System.out.println("       Architectual tour with "+ h.getParticipant()+" participants");
                                    break;
                                    
                                    case "RIVER_TOUR":
                                    System.out.println("       River tour with "+ h.getParticipant()+" participants");
                                    break;
    
                                    case "WINE_TASTING":
                                    System.out.println("       Wine tasting with "+ h.getParticipant()+" participants");
                                    break;
    
                                }
                            }
                        }
                    }
                }
    
            }
            return "";
    
        }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventManager other = (EventManager) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (clientes == null) {
            if (other.clientes != null)
                return false;
        } else if (!clientes.equals(other.clientes))
            return false;
        return true;
    }

    public HashSet<String> getClientsWithEvents() {
        HashSet<String> clientesSet = new HashSet<String>();
        for (cliente c : clientes.keySet()){
            clientesSet.add(c.toString());       
        }  
        return clientesSet;
    }

    public TreeSet<String> getNextEventsByDate(){
        TreeSet<String> events = new TreeSet<String>();
        for (List<event> e : clientes.values()){
            if (e!=null){events.add(e.toString());}
        }
        return events;
    }
    @Override
    public String toString() {
        return  Nome ;
    }
}
