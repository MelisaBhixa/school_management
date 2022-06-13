/*
 * Country Domain
 * CountryFactory.java
 * Thina Mbiza 217217095
 * 12 June 2022
 */

package za.ac.cput.domain.location;

public class Country {

    private String id;
    private String name;

    public Country(Builder Builder) {
        this.id = Builder.id;
        this.name = Builder.name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder {

        private String id;
        private String name;


        public Country.Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Country.Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build(){
            return new Country(this);
        }
    }
}
