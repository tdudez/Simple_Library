public class Doing {
    static Text[] text = new Text[15];
    static Journal[] journal = new Journal[10];
    Text[] btext = new Text[10];
    Journal[] bjournal = new Journal[5];
    public static void main(String[] args) {
        
    }

    static void generatebook(){
        text[0] = new Text("001", "First Semester in Numerical Analysis with Python", "Auraria Institutional Repository", 2020, "Yaning Liu");
        text[1] = new Text("002", "The Discipline of Organizing", "University of California, Berkeley", 2013, "Robert J. Glushko");
        text[2] = new Text("003", "The Joy of Cryptography", "Oregon State University", 2017, "Mike Rosulek");
        text[3] = new Text("004", "A Primer for Computational Biology", "Oregon State University", 2017, "Shawn T. O'Neil");
        text[4] = new Text("005", "Understanding Document Accessibility", "Ryerson University", 2020, "The Chang School");
        text[5] = new Text("006", "A Tale of Two Systems", "Oregon State University", 2017, "René Reitsma, Kevin Krueger");
        text[6] = new Text("007", "Computer Networks: A Systems Approach", "Larry Peterson and Bruce Davie", 2019, "Larry Peterson, Bruce Davie");
        text[7] = new Text("008", "Web Accessibility for Developers", "Ryerson University", 2019, "Digital Education Strategies");
        text[8] = new Text("009", "Making Games with Python & Pygame", "Albert Sweigart", 2012, "Albert Sweigart");
        text[9] = new Text("010", "An Introduction to Matlab and Mathcad", "APEX Calculus", 2011, "Troy Siemers");
        text[10] = new Text("011", "Delftse Foundations of Computation", "TU Delft Open", 2018, "Stefan Hugtenburg, Neil Yorke-Smith");
        text[11] = new Text("012", "A Byte of Python", "Swaroop C H", 2013, "Swaroop C H");
        text[12] = new Text("013", "High Performance Computing", "OpenStax CNX", 2010, "Charles Severance, Kevin Dowd");
        text[13] = new Text("014", "Inteligencia Artificial", "LATIn Project", 2014, "Julio Ponce");
        text[14] = new Text("015", "The Spec UI framework", "Square Bracket Associates", 2017, "Johan Fabry, Stephane Ducasse");

        journal[0] = new Journal("101", "journal1", "publicher1", 2020, 1, 2);
        journal[1] = new Journal("102", "journal2", "publicher2", 2020, 2, 2);
        journal[2] = new Journal("103", "journal3", "publicher3", 2020, 3, 2);
        journal[3] = new Journal("104", "journal4", "publicher4", 2020, 4, 2);
        journal[4] = new Journal("105", "journal5", "publicher5", 2020, 5, 2);
        journal[5] = new Journal("106", "journal6", "publicher6", 2020, 6, 2);
        journal[6] = new Journal("107", "journal7", "publicher7", 2020, 7, 2);
        journal[7] = new Journal("108", "journal8", "publicher8", 2020, 8, 2);
        journal[8] = new Journal("109", "journal9", "publicher9", 2020, 9, 2);
        journal[9] = new Journal("110", "journal10", "publicher10", 2020, 10, 2);

    }

}