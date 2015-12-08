// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.content.Context;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class AddressUtil
{

    private static HashMap countries;

    public AddressUtil()
    {
    }

    public static HashMap getCountries()
    {
        return countries;
    }

    public static String getCountryName(String s)
    {
        return (String)getCountries().get(s.toUpperCase());
    }

    public static HashMap getStateMapping()
    {
        return UserStatusManager.getInstance().getShippingLocations();
    }

    public static ArrayList getStates(String s)
    {
        return (ArrayList)getStateMapping().get(s.toUpperCase());
    }

    public static String getSubdivisionNameForCountry(String s)
    {
        if (UserStatusManager.getInstance().getCountrySubdivisionNames() != null)
        {
            return (String)UserStatusManager.getInstance().getCountrySubdivisionNames().get(s.toUpperCase());
        } else
        {
            return null;
        }
    }

    public static void initializeWithContext(Context context)
    {
        if (countries == null)
        {
            countries = new LinkedHashMap();
            countries.put("US", context.getString(0x7f06044f));
            countries.put("CA", context.getString(0x7f0600bb));
            countries.put("MX", context.getString(0x7f0602a2));
            countries.put("BR", context.getString(0x7f0600ab));
            countries.put("AF", context.getString(0x7f060059));
            countries.put("AL", context.getString(0x7f06005e));
            countries.put("DZ", context.getString(0x7f060060));
            countries.put("AS", context.getString(0x7f060066));
            countries.put("AD", context.getString(0x7f060068));
            countries.put("AO", context.getString(0x7f060069));
            countries.put("AI", context.getString(0x7f06006a));
            countries.put("AQ", context.getString(0x7f06006b));
            countries.put("AG", context.getString(0x7f06006c));
            countries.put("AR", context.getString(0x7f06007d));
            countries.put("AM", context.getString(0x7f060080));
            countries.put("AW", context.getString(0x7f060081));
            countries.put("AU", context.getString(0x7f060083));
            countries.put("AT", context.getString(0x7f060084));
            countries.put("AZ", context.getString(0x7f060086));
            countries.put("BS", context.getString(0x7f060088));
            countries.put("BH", context.getString(0x7f06008a));
            countries.put("BD", context.getString(0x7f06008d));
            countries.put("BB", context.getString(0x7f06008e));
            countries.put("BY", context.getString(0x7f06008f));
            countries.put("BE", context.getString(0x7f060090));
            countries.put("BZ", context.getString(0x7f060091));
            countries.put("BJ", context.getString(0x7f060092));
            countries.put("BM", context.getString(0x7f060093));
            countries.put("BT", context.getString(0x7f060095));
            countries.put("BO", context.getString(0x7f0600a3));
            countries.put("BA", context.getString(0x7f0600a4));
            countries.put("BW", context.getString(0x7f0600a5));
            countries.put("BV", context.getString(0x7f0600a7));
            countries.put("IO", context.getString(0x7f0600ad));
            countries.put("VG", context.getString(0x7f0600ae));
            countries.put("BN", context.getString(0x7f0600b1));
            countries.put("BG", context.getString(0x7f0600b3));
            countries.put("BF", context.getString(0x7f0600b4));
            countries.put("BI", context.getString(0x7f0600b5));
            countries.put("KH", context.getString(0x7f0600b8));
            countries.put("CM", context.getString(0x7f0600b9));
            countries.put("CV", context.getString(0x7f0600bd));
            countries.put("KY", context.getString(0x7f0600cf));
            countries.put("CF", context.getString(0x7f0600d3));
            countries.put("TD", context.getString(0x7f0600d4));
            countries.put("CL", context.getString(0x7f0600db));
            countries.put("CN", context.getString(0x7f0600dc));
            countries.put("CX", context.getString(0x7f0600e0));
            countries.put("CC", context.getString(0x7f0600ea));
            countries.put("CO", context.getString(0x7f0600ec));
            countries.put("KM", context.getString(0x7f0600f2));
            countries.put("CG", context.getString(0x7f0600f5));
            countries.put("CK", context.getString(0x7f0600fd));
            countries.put("CR", context.getString(0x7f0600fe));
            countries.put("HR", context.getString(0x7f060107));
            countries.put("CU", context.getString(0x7f060108));
            countries.put("CY", context.getString(0x7f06010b));
            countries.put("CZ", context.getString(0x7f06010c));
            countries.put("DK", context.getString(0x7f060114));
            countries.put("DJ", context.getString(0x7f06012b));
            countries.put("DM", context.getString(0x7f06012e));
            countries.put("DO", context.getString(0x7f06012f));
            countries.put("TP", context.getString(0x7f060133));
            countries.put("EC", context.getString(0x7f060134));
            countries.put("EG", context.getString(0x7f060139));
            countries.put("SV", context.getString(0x7f06013a));
            countries.put("GQ", context.getString(0x7f060144));
            countries.put("ER", context.getString(0x7f060145));
            countries.put("EE", context.getString(0x7f06014f));
            countries.put("ET", context.getString(0x7f060150));
            countries.put("FK", context.getString(0x7f060159));
            countries.put("FO", context.getString(0x7f06015d));
            countries.put("FJ", context.getString(0x7f060160));
            countries.put("FI", context.getString(0x7f060162));
            countries.put("FR", context.getString(0x7f0601df));
            countries.put("FX", context.getString(0x7f0601e0));
            countries.put("GF", context.getString(0x7f0601e2));
            countries.put("PF", context.getString(0x7f0601e3));
            countries.put("TF", context.getString(0x7f0601e4));
            countries.put("GA", context.getString(0x7f0601fc));
            countries.put("GM", context.getString(0x7f0601fe));
            countries.put("GE", context.getString(0x7f060205));
            countries.put("DE", context.getString(0x7f060206));
            countries.put("GH", context.getString(0x7f06020c));
            countries.put("GI", context.getString(0x7f06020d));
            countries.put("GR", context.getString(0x7f060224));
            countries.put("GL", context.getString(0x7f060225));
            countries.put("GD", context.getString(0x7f060226));
            countries.put("GP", context.getString(0x7f060227));
            countries.put("GU", context.getString(0x7f060228));
            countries.put("GT", context.getString(0x7f06022a));
            countries.put("GN", context.getString(0x7f06022c));
            countries.put("GW", context.getString(0x7f06022d));
            countries.put("GY", context.getString(0x7f06022e));
            countries.put("HT", context.getString(0x7f060231));
            countries.put("HM", context.getString(0x7f060235));
            countries.put("HN", context.getString(0x7f06023a));
            countries.put("HK", context.getString(0x7f06023b));
            countries.put("HU", context.getString(0x7f06023e));
            countries.put("IS", context.getString(0x7f06023f));
            countries.put("IN", context.getString(0x7f060243));
            countries.put("ID", context.getString(0x7f060246));
            countries.put("IQ", context.getString(0x7f060251));
            countries.put("IE", context.getString(0x7f060252));
            countries.put("IR", context.getString(0x7f060253));
            countries.put("IL", context.getString(0x7f060254));
            countries.put("IT", context.getString(0x7f060255));
            countries.put("CI", context.getString(0x7f06025a));
            countries.put("JM", context.getString(0x7f06025c));
            countries.put("JP", context.getString(0x7f06025d));
            countries.put("JO", context.getString(0x7f060261));
            countries.put("KZ", context.getString(0x7f060263));
            countries.put("KE", context.getString(0x7f060265));
            countries.put("KI", context.getString(0x7f060266));
            countries.put("KR", context.getString(0x7f060268));
            countries.put("KW", context.getString(0x7f060269));
            countries.put("KG", context.getString(0x7f06026a));
            countries.put("LA", context.getString(0x7f06026b));
            countries.put("LV", context.getString(0x7f06026d));
            countries.put("LB", context.getString(0x7f06026f));
            countries.put("LS", context.getString(0x7f060270));
            countries.put("LR", context.getString(0x7f060276));
            countries.put("LY", context.getString(0x7f060277));
            countries.put("LI", context.getString(0x7f060278));
            countries.put("LT", context.getString(0x7f06027d));
            countries.put("LU", context.getString(0x7f06028c));
            countries.put("MO", context.getString(0x7f06028d));
            countries.put("MG", context.getString(0x7f06028e));
            countries.put("MW", context.getString(0x7f060290));
            countries.put("MY", context.getString(0x7f060291));
            countries.put("MV", context.getString(0x7f060292));
            countries.put("ML", context.getString(0x7f060293));
            countries.put("MT", context.getString(0x7f060294));
            countries.put("MH", context.getString(0x7f060298));
            countries.put("MQ", context.getString(0x7f060299));
            countries.put("MR", context.getString(0x7f06029e));
            countries.put("MU", context.getString(0x7f06029f));
            countries.put("YT", context.getString(0x7f0602a0));
            countries.put("FM", context.getString(0x7f0602a5));
            countries.put("MD", context.getString(0x7f0602aa));
            countries.put("MC", context.getString(0x7f0602ab));
            countries.put("MN", context.getString(0x7f0602ac));
            countries.put("MS", context.getString(0x7f0602ae));
            countries.put("MA", context.getString(0x7f0602b3));
            countries.put("MZ", context.getString(0x7f0602b9));
            countries.put("MM", context.getString(0x7f0602bb));
            countries.put("NA", context.getString(0x7f0602bd));
            countries.put("NR", context.getString(0x7f0602be));
            countries.put("NP", context.getString(0x7f0602c1));
            countries.put("NL", context.getString(0x7f0602c2));
            countries.put("AN", context.getString(0x7f0602c3));
            countries.put("NC", context.getString(0x7f0602c9));
            countries.put("NZ", context.getString(0x7f0602d1));
            countries.put("NI", context.getString(0x7f0602d4));
            countries.put("NE", context.getString(0x7f0602d5));
            countries.put("NG", context.getString(0x7f0602d6));
            countries.put("NU", context.getString(0x7f0602d7));
            countries.put("NF", context.getString(0x7f0602eb));
            countries.put("MP", context.getString(0x7f0602ee));
            countries.put("NO", context.getString(0x7f0602f0));
            countries.put("OM", context.getString(0x7f060308));
            countries.put("PK", context.getString(0x7f06031f));
            countries.put("PW", context.getString(0x7f060320));
            countries.put("PA", context.getString(0x7f060321));
            countries.put("PG", context.getString(0x7f060322));
            countries.put("PY", context.getString(0x7f060324));
            countries.put("PE", context.getString(0x7f060333));
            countries.put("PH", context.getString(0x7f060334));
            countries.put("PN", context.getString(0x7f060340));
            countries.put("PL", context.getString(0x7f060344));
            countries.put("PT", context.getString(0x7f060347));
            countries.put("PR", context.getString(0x7f060354));
            countries.put("QA", context.getString(0x7f060357));
            countries.put("RE", context.getString(0x7f06037a));
            countries.put("RO", context.getString(0x7f060381));
            countries.put("RU", context.getString(0x7f060384));
            countries.put("RW", context.getString(0x7f060385));
            countries.put("LC", context.getString(0x7f060386));
            countries.put("WS", context.getString(0x7f060387));
            countries.put("SM", context.getString(0x7f060389));
            countries.put("ST", context.getString(0x7f06038c));
            countries.put("SA", context.getString(0x7f06038e));
            countries.put("SN", context.getString(0x7f0603b0));
            countries.put("RS", context.getString(0x7f0603b1));
            countries.put("SC", context.getString(0x7f0603b6));
            countries.put("SL", context.getString(0x7f0603e3));
            countries.put("SG", context.getString(0x7f0603e8));
            countries.put("SK", context.getString(0x7f0603ee));
            countries.put("SI", context.getString(0x7f0603ef));
            countries.put("SB", context.getString(0x7f0603f2));
            countries.put("SO", context.getString(0x7f0603f3));
            countries.put("ZA", context.getString(0x7f060405));
            countries.put("ES", context.getString(0x7f060408));
            countries.put("LK", context.getString(0x7f060409));
            countries.put("SH", context.getString(0x7f06040f));
            countries.put("KN", context.getString(0x7f060410));
            countries.put("PM", context.getString(0x7f060411));
            countries.put("VC", context.getString(0x7f060412));
            countries.put("SD", context.getString(0x7f06041b));
            countries.put("SR", context.getString(0x7f06041d));
            countries.put("SJ", context.getString(0x7f06041e));
            countries.put("SZ", context.getString(0x7f06041f));
            countries.put("SE", context.getString(0x7f060420));
            countries.put("CH", context.getString(0x7f060421));
            countries.put("SY", context.getString(0x7f060422));
            countries.put("TW", context.getString(0x7f06042b));
            countries.put("TJ", context.getString(0x7f06042c));
            countries.put("TZ", context.getString(0x7f06042f));
            countries.put("TH", context.getString(0x7f060435));
            countries.put("TG", context.getString(0x7f06043c));
            countries.put("TK", context.getString(0x7f06043d));
            countries.put("TO", context.getString(0x7f06043e));
            countries.put("TT", context.getString(0x7f060442));
            countries.put("TN", context.getString(0x7f060445));
            countries.put("TR", context.getString(0x7f060446));
            countries.put("TM", context.getString(0x7f060447));
            countries.put("TC", context.getString(0x7f060448));
            countries.put("TV", context.getString(0x7f060449));
            countries.put("UG", context.getString(0x7f06044b));
            countries.put("UA", context.getString(0x7f06044c));
            countries.put("AE", context.getString(0x7f06044d));
            countries.put("GB", context.getString(0x7f06044e));
            countries.put("VI", context.getString(0x7f060450));
            countries.put("UY", context.getString(0x7f06045c));
            countries.put("UZ", context.getString(0x7f060464));
            countries.put("VU", context.getString(0x7f060465));
            countries.put("VA", context.getString(0x7f060466));
            countries.put("VE", context.getString(0x7f060467));
            countries.put("VN", context.getString(0x7f06046a));
            countries.put("WF", context.getString(0x7f060477));
            countries.put("EH", context.getString(0x7f06047e));
            countries.put("YE", context.getString(0x7f060487));
            countries.put("ZR", context.getString(0x7f060493));
            countries.put("ZM", context.getString(0x7f060494));
            countries.put("ZW", context.getString(0x7f060495));
        }
    }
}
