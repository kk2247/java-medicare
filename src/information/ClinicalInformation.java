package information;

import fileIO.MyData;

public class ClinicalInformation extends MyData {
        private String hospitalName;
        private String hospitalID;
        private String hospiatalType;
        private String sickInformation;
        private String outDate;
        private String hospitalLevel;
        private String sickName;
        private String reason;
        public ClinicalInformation(String name, String ID) {
            super(name, ID);
        }

        public ClinicalInformation(String name, String ID, String hospitalName, String hospitalID, String hospiatalType, String sickInformation, String outDate, String hospitalLevel, String sickName, String reason) {
            super(name, ID);
            this.hospitalName = hospitalName;
            this.hospitalID = hospitalID;
            this.hospiatalType = hospiatalType;
            this.sickInformation = sickInformation;
            this.outDate = outDate;
            this.hospitalLevel = hospitalLevel;
            this.sickName = sickName;
            this.reason = reason;
        }

        public String getHospitalName() {
            return hospitalName;
        }

        public void setHospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
        }

        public String getHospitalID() {
            return hospitalID;
        }

        public void setHospitalID(String hospitalID) {
            this.hospitalID = hospitalID;
        }

        public String getHospiatalType() {
            return hospiatalType;
        }

        public void setHospiatalType(String hospiatalType) {
            this.hospiatalType = hospiatalType;
        }

        public String getSickInformation() {
            return sickInformation;
        }

        public void setSickInformation(String sickInformation) {
            this.sickInformation = sickInformation;
        }

        public String getOutDate() {
            return outDate;
        }

        public void setOutDate(String outDate) {
            this.outDate = outDate;
        }

        public String getHospitalLevel() {
            return hospitalLevel;
        }

        public void setHospitalLevel(String hospitalLevel) {
            this.hospitalLevel = hospitalLevel;
        }

        public String getSickName() {
            return sickName;
        }

        public void setSickName(String sickName) {
            this.sickName = sickName;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
