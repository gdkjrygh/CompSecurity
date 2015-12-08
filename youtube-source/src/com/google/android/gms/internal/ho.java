// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hq, gi

public final class ho
    implements SafeParcelable
{

    public static final hq CREATOR = new hq();
    public static final ho CW = aB("accounting");
    public static final ho CX = aB("airport");
    public static final ho CY = aB("amusement_park");
    public static final ho CZ = aB("aquarium");
    public static final ho DA = aB("electrician");
    public static final ho DB = aB("electronics_store");
    public static final ho DC = aB("embassy");
    public static final ho DD = aB("establishment");
    public static final ho DE = aB("finance");
    public static final ho DF = aB("fire_station");
    public static final ho DG = aB("florist");
    public static final ho DH = aB("food");
    public static final ho DI = aB("funeral_home");
    public static final ho DJ = aB("furniture_store");
    public static final ho DK = aB("gas_station");
    public static final ho DL = aB("general_contractor");
    public static final ho DM = aB("grocery_or_supermarket");
    public static final ho DN = aB("gym");
    public static final ho DO = aB("hair_care");
    public static final ho DP = aB("hardware_store");
    public static final ho DQ = aB("health");
    public static final ho DR = aB("hindu_temple");
    public static final ho DS = aB("home_goods_store");
    public static final ho DT = aB("hospital");
    public static final ho DU = aB("insurance_agency");
    public static final ho DV = aB("jewelry_store");
    public static final ho DW = aB("laundry");
    public static final ho DX = aB("lawyer");
    public static final ho DY = aB("library");
    public static final ho DZ = aB("liquor_store");
    public static final ho Da = aB("art_gallery");
    public static final ho Db = aB("atm");
    public static final ho Dc = aB("bakery");
    public static final ho Dd = aB("bank");
    public static final ho De = aB("bar");
    public static final ho Df = aB("beauty_salon");
    public static final ho Dg = aB("bicycle_store");
    public static final ho Dh = aB("book_store");
    public static final ho Di = aB("bowling_alley");
    public static final ho Dj = aB("bus_station");
    public static final ho Dk = aB("cafe");
    public static final ho Dl = aB("campground");
    public static final ho Dm = aB("car_dealer");
    public static final ho Dn = aB("car_rental");
    public static final ho Do = aB("car_repair");
    public static final ho Dp = aB("car_wash");
    public static final ho Dq = aB("casino");
    public static final ho Dr = aB("cemetary");
    public static final ho Ds = aB("church");
    public static final ho Dt = aB("city_hall");
    public static final ho Du = aB("clothing_store");
    public static final ho Dv = aB("convenience_store");
    public static final ho Dw = aB("courthouse");
    public static final ho Dx = aB("dentist");
    public static final ho Dy = aB("department_store");
    public static final ho Dz = aB("doctor");
    public static final ho EA = aB("shoe_store");
    public static final ho EB = aB("shopping_mall");
    public static final ho EC = aB("spa");
    public static final ho ED = aB("stadium");
    public static final ho EE = aB("storage");
    public static final ho EF = aB("store");
    public static final ho EG = aB("subway_station");
    public static final ho EH = aB("synagogue");
    public static final ho EI = aB("taxi_stand");
    public static final ho EJ = aB("train_station");
    public static final ho EK = aB("travel_agency");
    public static final ho EL = aB("university");
    public static final ho EM = aB("veterinary_care");
    public static final ho EN = aB("zoo");
    public static final ho EO = aB("administrative_area_level_1");
    public static final ho EP = aB("administrative_area_level_2");
    public static final ho EQ = aB("administrative_area_level_3");
    public static final ho ER = aB("colloquial_area");
    public static final ho ES = aB("country");
    public static final ho ET = aB("floor");
    public static final ho EU = aB("geocode");
    public static final ho EV = aB("intersection");
    public static final ho EW = aB("locality");
    public static final ho EX = aB("natural_feature");
    public static final ho EY = aB("neighborhood");
    public static final ho EZ = aB("political");
    public static final ho Ea = aB("local_government_office");
    public static final ho Eb = aB("locksmith");
    public static final ho Ec = aB("lodging");
    public static final ho Ed = aB("meal_delivery");
    public static final ho Ee = aB("meal_takeaway");
    public static final ho Ef = aB("mosque");
    public static final ho Eg = aB("movie_rental");
    public static final ho Eh = aB("movie_theater");
    public static final ho Ei = aB("moving_company");
    public static final ho Ej = aB("museum");
    public static final ho Ek = aB("night_club");
    public static final ho El = aB("painter");
    public static final ho Em = aB("park");
    public static final ho En = aB("parking");
    public static final ho Eo = aB("pet_store");
    public static final ho Ep = aB("pharmacy");
    public static final ho Eq = aB("physiotherapist");
    public static final ho Er = aB("place_of_worship");
    public static final ho Es = aB("plumber");
    public static final ho Et = aB("police");
    public static final ho Eu = aB("post_office");
    public static final ho Ev = aB("real_estate_agency");
    public static final ho Ew = aB("restaurant");
    public static final ho Ex = aB("roofing_contractor");
    public static final ho Ey = aB("rv_park");
    public static final ho Ez = aB("school");
    public static final ho Fa = aB("point_of_interest");
    public static final ho Fb = aB("post_box");
    public static final ho Fc = aB("postal_code");
    public static final ho Fd = aB("postal_code_prefix");
    public static final ho Fe = aB("postal_town");
    public static final ho Ff = aB("premise");
    public static final ho Fg = aB("room");
    public static final ho Fh = aB("route");
    public static final ho Fi = aB("street_address");
    public static final ho Fj = aB("sublocality");
    public static final ho Fk = aB("sublocality_level_1");
    public static final ho Fl = aB("sublocality_level_2");
    public static final ho Fm = aB("sublocality_level_3");
    public static final ho Fn = aB("sublocality_level_4");
    public static final ho Fo = aB("sublocality_level_5");
    public static final ho Fp = aB("subpremise");
    public static final ho Fq = aB("transit_station");
    final String Fr;
    final int jE;

    ho(int i, String s)
    {
        gi.a(s);
        jE = i;
        Fr = s;
    }

    public static ho aB(String s)
    {
        return new ho(0, s);
    }

    public final int describeContents()
    {
        hq hq1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ho) && Fr.equals(((ho)obj).Fr);
    }

    public final int hashCode()
    {
        return Fr.hashCode();
    }

    public final String toString()
    {
        return Fr;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        hq hq1 = CREATOR;
        hq.a(this, parcel);
    }

}
