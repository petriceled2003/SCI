package ro.sci.carrental.domain.car;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Car implements List<Car> {
    private String make;
    private String model;
    private float size;
    private String color;
    private int seats;
    private int doors;
    private boolean ac = false;
    private boolean gps = false;
    private boolean gearbox = false; //TRUE automatic, FALSE manual
    private FuelType fuelType;
    private VehicleCategory vehicleCategory;

    private String engine;


    // constructor sa mai sterg din parametri

    public Car() {
    }


//    public Car(String make, String model, float size, String color, int seats, int doors, boolean ac, boolean gps, boolean gearbox, FuelType fuelType, VehicleCategory vehicleCategory) {
//        this.make = make;
//        this.model = model;
//        this.size = size;
//        this.color = color;
//        this.seats = seats;
//        this.doors = doors;
//        this.ac = ac;
//        this.gps = gps;
//        this.gearbox = gearbox;
//        this.fuelType = fuelType;
//        this.vehicleCategory = vehicleCategory;
//    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isGearbox() {
        return gearbox;
    }

    public void setGearbox(boolean gearbox) {
        this.gearbox = gearbox;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", ac=" + ac +
                ", gps=" + gps +
                ", gearbox=" + gearbox +
                ", fuelType=" + fuelType +
                ", vehicleCategory=" + vehicleCategory +
                ", engine='" + engine + '\'' +
                '}';
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Car> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Car car) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Car> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Car> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Car get(int index) {
        return null;
    }

    @Override
    public Car set(int index, Car element) {
        return null;
    }

    @Override
    public void add(int index, Car element) {

    }

    @Override
    public Car remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Car> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Car> listIterator(int index) {
        return null;
    }

    @Override
    public List<Car> subList(int fromIndex, int toIndex) {
        return null;
    }
}
