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

    private Country(Country.CountryBuilder countryBuilder) {
        this.id = countryBuilder.id;
        this.name = countryBuilder.name;
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
                "Id='" + id + '\'' +
                ", name=" + name +
                '}';
    }

    public static class CountryBuilder{
        private String id;
        private String name;
        public CountryBuilder setId(String id) {
            this.id = id;
            return this;
        }
        public CountryBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CountryBuilder copy(Country country){
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build(){
            return new Country(this);
        }
    }
}

