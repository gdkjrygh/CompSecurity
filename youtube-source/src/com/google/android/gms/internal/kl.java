// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            fe, je

public final class kl extends fe
    implements SafeParcelable, a
{

    public static final je CREATOR = new je();
    private static final HashMap Mu;
    private double Cl;
    private double Cm;
    private String Fr;
    private String MA;
    private String MB;
    private List MC;
    private int MD;
    private List ME;
    private kl MF;
    private List MG;
    private String MH;
    private String MI;
    private kl MJ;
    private String MK;
    private String ML;
    private String MM;
    private List MN;
    private String MO;
    private String MP;
    private String MQ;
    private String MR;
    private String MS;
    private String MT;
    private String MU;
    private String MV;
    private kl MW;
    private String MX;
    private String MY;
    private String MZ;
    private final Set Mv;
    private kl Mw;
    private List Mx;
    private kl My;
    private String Mz;
    private kl Na;
    private kl Nb;
    private kl Nc;
    private List Nd;
    private String Ne;
    private String Nf;
    private String Ng;
    private String Nh;
    private kl Ni;
    private String Nj;
    private String Nk;
    private String Nl;
    private kl Nm;
    private String Nn;
    private String No;
    private String Np;
    private String Nq;
    private String iK;
    private final int jE;
    private String mName;
    private String xc;
    private String zk;

    public kl()
    {
        jE = 1;
        Mv = new HashSet();
    }

    kl(Set set, int i, kl kl1, List list, kl kl2, String s, String s1, 
            String s2, List list1, int j, List list2, kl kl3, List list3, String s3, 
            String s4, kl kl4, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, kl kl5, String s17, String s18, String s19, String s20, kl kl6, 
            double d, kl kl7, double d1, String s21, kl kl8, 
            List list5, String s22, String s23, String s24, String s25, kl kl9, String s26, 
            String s27, String s28, kl kl10, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        Mv = set;
        jE = i;
        Mw = kl1;
        Mx = list;
        My = kl2;
        Mz = s;
        MA = s1;
        MB = s2;
        MC = list1;
        MD = j;
        ME = list2;
        MF = kl3;
        MG = list3;
        MH = s3;
        MI = s4;
        MJ = kl4;
        MK = s5;
        ML = s6;
        MM = s7;
        MN = list4;
        MO = s8;
        MP = s9;
        MQ = s10;
        xc = s11;
        MR = s12;
        MS = s13;
        MT = s14;
        MU = s15;
        MV = s16;
        MW = kl5;
        MX = s17;
        MY = s18;
        zk = s19;
        MZ = s20;
        Na = kl6;
        Cl = d;
        Nb = kl7;
        Cm = d1;
        mName = s21;
        Nc = kl8;
        Nd = list5;
        Ne = s22;
        Nf = s23;
        Ng = s24;
        Nh = s25;
        Ni = kl9;
        Nj = s26;
        Nk = s27;
        Nl = s28;
        Nm = kl10;
        Nn = s29;
        No = s30;
        Fr = s31;
        iK = s32;
        Np = s33;
        Nq = s34;
    }

    public kl(Set set, kl kl1, List list, kl kl2, String s, String s1, String s2, 
            List list1, int i, List list2, kl kl3, List list3, String s3, String s4, 
            kl kl4, String s5, String s6, String s7, List list4, String s8, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            kl kl5, String s17, String s18, String s19, String s20, kl kl6, double d, kl kl7, double d1, String s21, kl kl8, List list5, 
            String s22, String s23, String s24, String s25, kl kl9, String s26, String s27, 
            String s28, kl kl10, String s29, String s30, String s31, String s32, String s33, 
            String s34)
    {
        Mv = set;
        jE = 1;
        Mw = kl1;
        Mx = list;
        My = kl2;
        Mz = s;
        MA = s1;
        MB = s2;
        MC = list1;
        MD = i;
        ME = list2;
        MF = kl3;
        MG = list3;
        MH = s3;
        MI = s4;
        MJ = kl4;
        MK = s5;
        ML = s6;
        MM = s7;
        MN = list4;
        MO = s8;
        MP = s9;
        MQ = s10;
        xc = s11;
        MR = s12;
        MS = s13;
        MT = s14;
        MU = s15;
        MV = s16;
        MW = kl5;
        MX = s17;
        MY = s18;
        zk = s19;
        MZ = s20;
        Na = kl6;
        Cl = d;
        Nb = kl7;
        Cm = d1;
        mName = s21;
        Nc = kl8;
        Nd = list5;
        Ne = s22;
        Nf = s23;
        Ng = s24;
        Nh = s25;
        Ni = kl9;
        Nj = s26;
        Nk = s27;
        Nl = s28;
        Nm = kl10;
        Nn = s29;
        No = s30;
        Fr = s31;
        iK = s32;
        Np = s33;
        Nq = s34;
    }

    protected final boolean a(fe.a a1)
    {
        return Mv.contains(Integer.valueOf(a1.cq()));
    }

    protected final Object ac(String s)
    {
        return null;
    }

    protected final boolean ad(String s)
    {
        return false;
    }

    protected final Object b(fe.a a1)
    {
        switch (a1.cq())
        {
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(a1.cq()).toString());

        case 2: // '\002'
            return Mw;

        case 3: // '\003'
            return Mx;

        case 4: // '\004'
            return My;

        case 5: // '\005'
            return Mz;

        case 6: // '\006'
            return MA;

        case 7: // '\007'
            return MB;

        case 8: // '\b'
            return MC;

        case 9: // '\t'
            return Integer.valueOf(MD);

        case 10: // '\n'
            return ME;

        case 11: // '\013'
            return MF;

        case 12: // '\f'
            return MG;

        case 13: // '\r'
            return MH;

        case 14: // '\016'
            return MI;

        case 15: // '\017'
            return MJ;

        case 16: // '\020'
            return MK;

        case 17: // '\021'
            return ML;

        case 18: // '\022'
            return MM;

        case 19: // '\023'
            return MN;

        case 20: // '\024'
            return MO;

        case 21: // '\025'
            return MP;

        case 22: // '\026'
            return MQ;

        case 23: // '\027'
            return xc;

        case 24: // '\030'
            return MR;

        case 25: // '\031'
            return MS;

        case 26: // '\032'
            return MT;

        case 27: // '\033'
            return MU;

        case 28: // '\034'
            return MV;

        case 29: // '\035'
            return MW;

        case 30: // '\036'
            return MX;

        case 31: // '\037'
            return MY;

        case 32: // ' '
            return zk;

        case 33: // '!'
            return MZ;

        case 34: // '"'
            return Na;

        case 36: // '$'
            return Double.valueOf(Cl);

        case 37: // '%'
            return Nb;

        case 38: // '&'
            return Double.valueOf(Cm);

        case 39: // '\''
            return mName;

        case 40: // '('
            return Nc;

        case 41: // ')'
            return Nd;

        case 42: // '*'
            return Ne;

        case 43: // '+'
            return Nf;

        case 44: // ','
            return Ng;

        case 45: // '-'
            return Nh;

        case 46: // '.'
            return Ni;

        case 47: // '/'
            return Nj;

        case 48: // '0'
            return Nk;

        case 49: // '1'
            return Nl;

        case 50: // '2'
            return Nm;

        case 51: // '3'
            return Nn;

        case 52: // '4'
            return No;

        case 53: // '5'
            return Fr;

        case 54: // '6'
            return iK;

        case 55: // '7'
            return Np;

        case 56: // '8'
            return Nq;
        }
    }

    public final HashMap cj()
    {
        return Mu;
    }

    public final int describeContents()
    {
        je je1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof kl))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (kl)obj;
            fe.a a1;
label1:
            do
            {
                for (Iterator iterator = Mu.values().iterator(); iterator.hasNext();)
                {
                    a1 = (fe.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (((kl) (obj)).a(a1))
                    {
                        if (!b(a1).equals(((kl) (obj)).b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((kl) (obj)).a(a1));
            return false;
        }
        return true;
    }

    final Set fD()
    {
        return Mv;
    }

    final kl fE()
    {
        return Mw;
    }

    final kl fF()
    {
        return My;
    }

    final List fG()
    {
        return MC;
    }

    final List fH()
    {
        return ME;
    }

    final kl fI()
    {
        return MF;
    }

    final List fJ()
    {
        return MG;
    }

    final kl fK()
    {
        return MJ;
    }

    final List fL()
    {
        return MN;
    }

    final kl fM()
    {
        return MW;
    }

    final kl fN()
    {
        return Na;
    }

    final kl fO()
    {
        return Nb;
    }

    final kl fP()
    {
        return Nc;
    }

    final List fQ()
    {
        return Nd;
    }

    final kl fR()
    {
        return Ni;
    }

    final kl fS()
    {
        return Nm;
    }

    public final kl fT()
    {
        return this;
    }

    public final Object freeze()
    {
        return fT();
    }

    public final a getAbout()
    {
        return Mw;
    }

    public final List getAdditionalName()
    {
        return Mx;
    }

    public final a getAddress()
    {
        return My;
    }

    public final String getAddressCountry()
    {
        return Mz;
    }

    public final String getAddressLocality()
    {
        return MA;
    }

    public final String getAddressRegion()
    {
        return MB;
    }

    public final List getAssociated_media()
    {
        return (ArrayList)MC;
    }

    public final int getAttendeeCount()
    {
        return MD;
    }

    public final List getAttendees()
    {
        return (ArrayList)ME;
    }

    public final a getAudio()
    {
        return MF;
    }

    public final List getAuthor()
    {
        return (ArrayList)MG;
    }

    public final String getBestRating()
    {
        return MH;
    }

    public final String getBirthDate()
    {
        return MI;
    }

    public final a getByArtist()
    {
        return MJ;
    }

    public final String getCaption()
    {
        return MK;
    }

    public final String getContentSize()
    {
        return ML;
    }

    public final String getContentUrl()
    {
        return MM;
    }

    public final List getContributor()
    {
        return (ArrayList)MN;
    }

    public final String getDateCreated()
    {
        return MO;
    }

    public final String getDateModified()
    {
        return MP;
    }

    public final String getDatePublished()
    {
        return MQ;
    }

    public final String getDescription()
    {
        return xc;
    }

    public final String getDuration()
    {
        return MR;
    }

    public final String getEmbedUrl()
    {
        return MS;
    }

    public final String getEndDate()
    {
        return MT;
    }

    public final String getFamilyName()
    {
        return MU;
    }

    public final String getGender()
    {
        return MV;
    }

    public final a getGeo()
    {
        return MW;
    }

    public final String getGivenName()
    {
        return MX;
    }

    public final String getHeight()
    {
        return MY;
    }

    public final String getId()
    {
        return zk;
    }

    public final String getImage()
    {
        return MZ;
    }

    public final a getInAlbum()
    {
        return Na;
    }

    public final double getLatitude()
    {
        return Cl;
    }

    public final a getLocation()
    {
        return Nb;
    }

    public final double getLongitude()
    {
        return Cm;
    }

    public final String getName()
    {
        return mName;
    }

    public final a getPartOfTVSeries()
    {
        return Nc;
    }

    public final List getPerformers()
    {
        return (ArrayList)Nd;
    }

    public final String getPlayerType()
    {
        return Ne;
    }

    public final String getPostOfficeBoxNumber()
    {
        return Nf;
    }

    public final String getPostalCode()
    {
        return Ng;
    }

    public final String getRatingValue()
    {
        return Nh;
    }

    public final a getReviewRating()
    {
        return Ni;
    }

    public final String getStartDate()
    {
        return Nj;
    }

    public final String getStreetAddress()
    {
        return Nk;
    }

    public final String getText()
    {
        return Nl;
    }

    public final a getThumbnail()
    {
        return Nm;
    }

    public final String getThumbnailUrl()
    {
        return Nn;
    }

    public final String getTickerSymbol()
    {
        return No;
    }

    public final String getType()
    {
        return Fr;
    }

    public final String getUrl()
    {
        return iK;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final String getWidth()
    {
        return Np;
    }

    public final String getWorstRating()
    {
        return Nq;
    }

    public final boolean hasAbout()
    {
        return Mv.contains(Integer.valueOf(2));
    }

    public final boolean hasAdditionalName()
    {
        return Mv.contains(Integer.valueOf(3));
    }

    public final boolean hasAddress()
    {
        return Mv.contains(Integer.valueOf(4));
    }

    public final boolean hasAddressCountry()
    {
        return Mv.contains(Integer.valueOf(5));
    }

    public final boolean hasAddressLocality()
    {
        return Mv.contains(Integer.valueOf(6));
    }

    public final boolean hasAddressRegion()
    {
        return Mv.contains(Integer.valueOf(7));
    }

    public final boolean hasAssociated_media()
    {
        return Mv.contains(Integer.valueOf(8));
    }

    public final boolean hasAttendeeCount()
    {
        return Mv.contains(Integer.valueOf(9));
    }

    public final boolean hasAttendees()
    {
        return Mv.contains(Integer.valueOf(10));
    }

    public final boolean hasAudio()
    {
        return Mv.contains(Integer.valueOf(11));
    }

    public final boolean hasAuthor()
    {
        return Mv.contains(Integer.valueOf(12));
    }

    public final boolean hasBestRating()
    {
        return Mv.contains(Integer.valueOf(13));
    }

    public final boolean hasBirthDate()
    {
        return Mv.contains(Integer.valueOf(14));
    }

    public final boolean hasByArtist()
    {
        return Mv.contains(Integer.valueOf(15));
    }

    public final boolean hasCaption()
    {
        return Mv.contains(Integer.valueOf(16));
    }

    public final boolean hasContentSize()
    {
        return Mv.contains(Integer.valueOf(17));
    }

    public final boolean hasContentUrl()
    {
        return Mv.contains(Integer.valueOf(18));
    }

    public final boolean hasContributor()
    {
        return Mv.contains(Integer.valueOf(19));
    }

    public final boolean hasDateCreated()
    {
        return Mv.contains(Integer.valueOf(20));
    }

    public final boolean hasDateModified()
    {
        return Mv.contains(Integer.valueOf(21));
    }

    public final boolean hasDatePublished()
    {
        return Mv.contains(Integer.valueOf(22));
    }

    public final boolean hasDescription()
    {
        return Mv.contains(Integer.valueOf(23));
    }

    public final boolean hasDuration()
    {
        return Mv.contains(Integer.valueOf(24));
    }

    public final boolean hasEmbedUrl()
    {
        return Mv.contains(Integer.valueOf(25));
    }

    public final boolean hasEndDate()
    {
        return Mv.contains(Integer.valueOf(26));
    }

    public final boolean hasFamilyName()
    {
        return Mv.contains(Integer.valueOf(27));
    }

    public final boolean hasGender()
    {
        return Mv.contains(Integer.valueOf(28));
    }

    public final boolean hasGeo()
    {
        return Mv.contains(Integer.valueOf(29));
    }

    public final boolean hasGivenName()
    {
        return Mv.contains(Integer.valueOf(30));
    }

    public final boolean hasHeight()
    {
        return Mv.contains(Integer.valueOf(31));
    }

    public final boolean hasId()
    {
        return Mv.contains(Integer.valueOf(32));
    }

    public final boolean hasImage()
    {
        return Mv.contains(Integer.valueOf(33));
    }

    public final boolean hasInAlbum()
    {
        return Mv.contains(Integer.valueOf(34));
    }

    public final boolean hasLatitude()
    {
        return Mv.contains(Integer.valueOf(36));
    }

    public final boolean hasLocation()
    {
        return Mv.contains(Integer.valueOf(37));
    }

    public final boolean hasLongitude()
    {
        return Mv.contains(Integer.valueOf(38));
    }

    public final boolean hasName()
    {
        return Mv.contains(Integer.valueOf(39));
    }

    public final boolean hasPartOfTVSeries()
    {
        return Mv.contains(Integer.valueOf(40));
    }

    public final boolean hasPerformers()
    {
        return Mv.contains(Integer.valueOf(41));
    }

    public final boolean hasPlayerType()
    {
        return Mv.contains(Integer.valueOf(42));
    }

    public final boolean hasPostOfficeBoxNumber()
    {
        return Mv.contains(Integer.valueOf(43));
    }

    public final boolean hasPostalCode()
    {
        return Mv.contains(Integer.valueOf(44));
    }

    public final boolean hasRatingValue()
    {
        return Mv.contains(Integer.valueOf(45));
    }

    public final boolean hasReviewRating()
    {
        return Mv.contains(Integer.valueOf(46));
    }

    public final boolean hasStartDate()
    {
        return Mv.contains(Integer.valueOf(47));
    }

    public final boolean hasStreetAddress()
    {
        return Mv.contains(Integer.valueOf(48));
    }

    public final boolean hasText()
    {
        return Mv.contains(Integer.valueOf(49));
    }

    public final boolean hasThumbnail()
    {
        return Mv.contains(Integer.valueOf(50));
    }

    public final boolean hasThumbnailUrl()
    {
        return Mv.contains(Integer.valueOf(51));
    }

    public final boolean hasTickerSymbol()
    {
        return Mv.contains(Integer.valueOf(52));
    }

    public final boolean hasType()
    {
        return Mv.contains(Integer.valueOf(53));
    }

    public final boolean hasUrl()
    {
        return Mv.contains(Integer.valueOf(54));
    }

    public final boolean hasWidth()
    {
        return Mv.contains(Integer.valueOf(55));
    }

    public final boolean hasWorstRating()
    {
        return Mv.contains(Integer.valueOf(56));
    }

    public final int hashCode()
    {
        Iterator iterator = Mu.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fe.a a1 = (fe.a)iterator.next();
            if (a(a1))
            {
                int j = a1.cq();
                i = b(a1).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        je je1 = CREATOR;
        com.google.android.gms.internal.je.a(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        Mu = hashmap;
        hashmap.put("about", com.google.android.gms.internal.fe.a.a("about", 2, com/google/android/gms/internal/kl));
        Mu.put("additionalName", fe.a.h("additionalName", 3));
        Mu.put("address", com.google.android.gms.internal.fe.a.a("address", 4, com/google/android/gms/internal/kl));
        Mu.put("addressCountry", fe.a.g("addressCountry", 5));
        Mu.put("addressLocality", fe.a.g("addressLocality", 6));
        Mu.put("addressRegion", fe.a.g("addressRegion", 7));
        Mu.put("associated_media", fe.a.b("associated_media", 8, com/google/android/gms/internal/kl));
        Mu.put("attendeeCount", fe.a.d("attendeeCount", 9));
        Mu.put("attendees", fe.a.b("attendees", 10, com/google/android/gms/internal/kl));
        Mu.put("audio", com.google.android.gms.internal.fe.a.a("audio", 11, com/google/android/gms/internal/kl));
        Mu.put("author", fe.a.b("author", 12, com/google/android/gms/internal/kl));
        Mu.put("bestRating", fe.a.g("bestRating", 13));
        Mu.put("birthDate", fe.a.g("birthDate", 14));
        Mu.put("byArtist", com.google.android.gms.internal.fe.a.a("byArtist", 15, com/google/android/gms/internal/kl));
        Mu.put("caption", fe.a.g("caption", 16));
        Mu.put("contentSize", fe.a.g("contentSize", 17));
        Mu.put("contentUrl", fe.a.g("contentUrl", 18));
        Mu.put("contributor", fe.a.b("contributor", 19, com/google/android/gms/internal/kl));
        Mu.put("dateCreated", fe.a.g("dateCreated", 20));
        Mu.put("dateModified", fe.a.g("dateModified", 21));
        Mu.put("datePublished", fe.a.g("datePublished", 22));
        Mu.put("description", fe.a.g("description", 23));
        Mu.put("duration", fe.a.g("duration", 24));
        Mu.put("embedUrl", fe.a.g("embedUrl", 25));
        Mu.put("endDate", fe.a.g("endDate", 26));
        Mu.put("familyName", fe.a.g("familyName", 27));
        Mu.put("gender", fe.a.g("gender", 28));
        Mu.put("geo", com.google.android.gms.internal.fe.a.a("geo", 29, com/google/android/gms/internal/kl));
        Mu.put("givenName", fe.a.g("givenName", 30));
        Mu.put("height", fe.a.g("height", 31));
        Mu.put("id", fe.a.g("id", 32));
        Mu.put("image", fe.a.g("image", 33));
        Mu.put("inAlbum", com.google.android.gms.internal.fe.a.a("inAlbum", 34, com/google/android/gms/internal/kl));
        Mu.put("latitude", fe.a.e("latitude", 36));
        Mu.put("location", com.google.android.gms.internal.fe.a.a("location", 37, com/google/android/gms/internal/kl));
        Mu.put("longitude", fe.a.e("longitude", 38));
        Mu.put("name", fe.a.g("name", 39));
        Mu.put("partOfTVSeries", com.google.android.gms.internal.fe.a.a("partOfTVSeries", 40, com/google/android/gms/internal/kl));
        Mu.put("performers", fe.a.b("performers", 41, com/google/android/gms/internal/kl));
        Mu.put("playerType", fe.a.g("playerType", 42));
        Mu.put("postOfficeBoxNumber", fe.a.g("postOfficeBoxNumber", 43));
        Mu.put("postalCode", fe.a.g("postalCode", 44));
        Mu.put("ratingValue", fe.a.g("ratingValue", 45));
        Mu.put("reviewRating", com.google.android.gms.internal.fe.a.a("reviewRating", 46, com/google/android/gms/internal/kl));
        Mu.put("startDate", fe.a.g("startDate", 47));
        Mu.put("streetAddress", fe.a.g("streetAddress", 48));
        Mu.put("text", fe.a.g("text", 49));
        Mu.put("thumbnail", com.google.android.gms.internal.fe.a.a("thumbnail", 50, com/google/android/gms/internal/kl));
        Mu.put("thumbnailUrl", fe.a.g("thumbnailUrl", 51));
        Mu.put("tickerSymbol", fe.a.g("tickerSymbol", 52));
        Mu.put("type", fe.a.g("type", 53));
        Mu.put("url", fe.a.g("url", 54));
        Mu.put("width", fe.a.g("width", 55));
        Mu.put("worstRating", fe.a.g("worstRating", 56));
    }
}
