package com.pojo;

public class DoctorModel {
        private String DName;
        private String location;
        private String dName;
        private Integer dId;
        private String dSpec;
        private String dCertifi;
        private Boolean isMBBSDocrot;
        Integer dAge;
        private Integer dExep;

        public DoctorModel() {

        }

        public DoctorModel(String DName, String location, String dName, Integer dId, String dSpec, String dCertifi, Boolean isMBBSDocrot, Integer dAge, Integer dExep) {
            this.DName = DName;
            this.location = location;
            this.dName = dName;
            this.dId = dId;
            this.dSpec = dSpec;
            this.dCertifi = dCertifi;
            this.isMBBSDocrot = isMBBSDocrot;
            this.dAge = dAge;
            this.dExep = dExep;
        }

        public String getDName() {
            return DName;
        }

        public void setDName(String DName) {
            this.DName = DName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getdName() {
            return dName;
        }

        public void setdName(String dName) {
            this.dName = dName;
        }

        public Integer getdId() {
            return dId;
        }

        public void setdId(Integer dId) {
            this.dId = dId;
        }

        public String getdSpec() {
            return dSpec;
        }

        public void setdSpec(String dSpec) {
            this.dSpec = dSpec;
        }

        public String getdCertifi() {
            return dCertifi;
        }

        public void setdCertifi(String dCertifi) {
            this.dCertifi = dCertifi;
        }

        public Boolean getMBBSDocrot() {
            return isMBBSDocrot;
        }

        public void setMBBSDocrot(Boolean MBBSDocrot) {
            isMBBSDocrot = MBBSDocrot;
        }

        public Integer getdAge() {
            return dAge;
        }

        public void setdAge(Integer dAge) {
            this.dAge = dAge;
        }

        public Integer getdExep() {
            return dExep;
        }

        public void setdExep(Integer dExep) {
            this.dExep = dExep;
        }

        @Override
        public String toString() {
            return "DoctorModel{" +
                    "DName='" + DName + '\'' +
                    ", location='" + location + '\'' +
                    ", dName='" + dName + '\'' +
                    ", dId=" + dId +
                    ", dSpec='" + dSpec + '\'' +
                    ", dCertifi='" + dCertifi + '\'' +
                    ", isMBBSDocrot=" + isMBBSDocrot +
                    ", dAge=" + dAge +
                    ", dExep=" + dExep +
                    '}';
        }
}
