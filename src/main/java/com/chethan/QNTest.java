package com.chethan;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.chethan.QNTest.qnCountries;


public class QNTest {
    public static final List<String> qnCountries = new ArrayList<>(Arrays.asList("Brazil","Chile","Peru","Botswana","Lesotho","South Africa","Mozambique","Zimbabwe","Swaziland","Namibia","India"));
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        String[] cArry = new String[]{"Estonia", "Zimbabwe", "Namibia", "Sudan", "Curacao", "Serbia And Montenegro", "Turkmenistan", "United Kingdom", "Sao Tome and Principe", "Global", "American Samoa", "Antigua and Barbuda", "Argentina", "Aruba", "Saint Barthelemy", "Bahamas", "Barbados", "Belize", "Bermuda", "Bolivia", "Bonaire, Sint Eustatius and Saba", "Brazil", "Canada", "Cayman Islands", "Chad", "Chile", "Colombia", "Costa Rica", "Cuba", "Dominica", "Dominican Republic", "Ecuador", "El Salvador", "Falkland Islands (Malvinas)", "Grenada", "Guadeloupe", "Guam", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Jamaica", "Saint Martin (France)", "Marshall Islands", "Martinique", "Mexico", "Micronesia, Federated States of", "Montserrat", "Netherlands Antilles", "Nicaragua", "Northern Mariana Islands", "Panama", "Paraguay", "Peru", "Puerto Rico", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Sint Maarten (Dutch Part)", "Suriname", "Trinidad and Tobago", "United States", "United States Minor Outlying Islands", "Virgin Islands", "Uruguay", "Venezuela", "Virgin Islands, British", "Armenia", "Australia", "Bangladesh", "Bhutan", "Cambodia (Kampuchea)", "China", "Cocos (Keeling) Islands", "Cook Islands", "Christmas Island", "Fiji", "Heard Island And Mcdonald Islands", "Hong Kong", "India", "Indonesia", "Japan", "Kazakhstan", "Kiribati", "Kyrgyzstan", "Republic of Korea", "Korea, Democratic People's Republic Of North Korea", "Lao People's Democratic Republic", "Macao", "Malaysia", "Maldives", "Mongolia", "Myanmar", "Nauru", "Nepal", "New Zealand", "Niue", "Norfolk Island", "Pakistan", "Palau", "Papua New Guinea", "Philippines", "Samoa", "Singapore", "Solomon Islands", "Sri Lanka", "Taiwan", "Tajikistan", "Timor-Leste", "Tokelau", "Tonga", "Thailand", "Tuvalu", "Uzbekistan", "Vanuatu", "Viet Nam", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antarctica", "Austria", "Azerbaijan", "Bahrain", "Belarus", "Belgium", "Benin", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cameroon", "Cape Verde", "Central African Republic", "Congo", "Congo, The Democratic Republic Of The", "Comoros", "Croatia (Hrvatska)", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Faroe Islands", "Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Guatemala", "Guernsey", "Guinea", "Holy See (Vatican City State)", "Hungary", "Iceland", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Cote d'Ivoire(Ivory Coast)", "Jersey", "Jordan", "Kenya", "Kuwait", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Mali", "Malta", "Mauritania", "Mauritius", "Mayotte", "Moldova", "Monaco", "Morocco", "Mozambique", "Netherlands", "New Caledonia", "Niger", "Nigeria", "Norway", "Oman", "Palestinian Territory, Occupied", "Pitcairn", "Poland", "Portugal", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Helena", "Saint Pierre And Miquelon", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Montenegro", "Seychelles", "Sierra Leone", "Slovakia", "Slovenia", "Somalia", "South Africa", "South Georgia And The South Sandwich Islands", "Spain", "Svalbard And Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Tanzania, United Republic Of", "Togo", "Tunisia", "Turkey", "Turks And Caicos Islands", "Uganda", "Ukraine", "United Arab Emirates", "Wallis And Futuna", "Western Sahara", "Republic of Kosovo", "Yemen", "Yugoslavia", "Zambia", "South Sudan"};

        List<String> countries = Arrays.asList(cArry);
        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);
        Collections.sort(countries, new QNComparator());
        System.out.println(countries);
    }
}

class QNComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if(qnCountries.contains(s1) && qnCountries.contains(s2)){
            return String.CASE_INSENSITIVE_ORDER.compare(s1,s2);
        }else if(qnCountries.contains(s1)){
            return -1;
        }else if(qnCountries.contains(s2)){
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(s1,s2);
    }
}