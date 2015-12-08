// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            ItemScope

public static class Entity
{

    private String mName;
    private String zzEl;
    private String zzF;
    private String zzKI;
    private final Set zzaHQ = new HashSet();
    private ItemScopeEntity zzaHR;
    private List zzaHS;
    private ItemScopeEntity zzaHT;
    private String zzaHU;
    private String zzaHV;
    private String zzaHW;
    private List zzaHX;
    private int zzaHY;
    private List zzaHZ;
    private String zzaIA;
    private String zzaIB;
    private ItemScopeEntity zzaIC;
    private String zzaID;
    private String zzaIE;
    private String zzaIF;
    private ItemScopeEntity zzaIG;
    private String zzaIH;
    private String zzaII;
    private String zzaIJ;
    private String zzaIK;
    private ItemScopeEntity zzaIa;
    private List zzaIb;
    private String zzaIc;
    private String zzaId;
    private ItemScopeEntity zzaIe;
    private String zzaIf;
    private String zzaIg;
    private List zzaIh;
    private String zzaIi;
    private String zzaIj;
    private String zzaIk;
    private String zzaIl;
    private String zzaIm;
    private String zzaIn;
    private String zzaIo;
    private String zzaIp;
    private ItemScopeEntity zzaIq;
    private String zzaIr;
    private String zzaIs;
    private String zzaIt;
    private ItemScopeEntity zzaIu;
    private ItemScopeEntity zzaIv;
    private ItemScopeEntity zzaIw;
    private List zzaIx;
    private String zzaIy;
    private String zzaIz;
    private String zzakM;
    private double zzaxB;
    private double zzaxC;
    private String zzsB;

    public ItemScope build()
    {
        return new ItemScopeEntity(zzaHQ, zzaHR, zzaHS, zzaHT, zzaHU, zzaHV, zzaHW, zzaHX, zzaHY, zzaHZ, zzaIa, zzaIb, zzaIc, zzaId, zzaIe, zzaIf, zzaIg, zzsB, zzaIh, zzaIi, zzaIj, zzaIk, zzakM, zzaIl, zzaIm, zzaIn, zzaIo, zzaIp, zzaIq, zzaIr, zzaIs, zzKI, zzaIt, zzaIu, zzaxB, zzaIv, zzaxC, mName, zzaIw, zzaIx, zzaIy, zzaIz, zzaIA, zzaIB, zzaIC, zzaID, zzaIE, zzaIF, zzaIG, zzaIH, zzaII, zzEl, zzF, zzaIJ, zzaIK);
    }

    public zzaIK setAbout(ItemScope itemscope)
    {
        zzaHR = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(2));
        return this;
    }

    public zzaHQ setAdditionalName(List list)
    {
        zzaHS = list;
        zzaHQ.add(Integer.valueOf(3));
        return this;
    }

    public zzaHQ setAddress(ItemScope itemscope)
    {
        zzaHT = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(4));
        return this;
    }

    public zzaHQ setAddressCountry(String s)
    {
        zzaHU = s;
        zzaHQ.add(Integer.valueOf(5));
        return this;
    }

    public zzaHQ setAddressLocality(String s)
    {
        zzaHV = s;
        zzaHQ.add(Integer.valueOf(6));
        return this;
    }

    public zzaHQ setAddressRegion(String s)
    {
        zzaHW = s;
        zzaHQ.add(Integer.valueOf(7));
        return this;
    }

    public zzaHQ setAssociated_media(List list)
    {
        zzaHX = list;
        zzaHQ.add(Integer.valueOf(8));
        return this;
    }

    public zzaHQ setAttendeeCount(int i)
    {
        zzaHY = i;
        zzaHQ.add(Integer.valueOf(9));
        return this;
    }

    public zzaHQ setAttendees(List list)
    {
        zzaHZ = list;
        zzaHQ.add(Integer.valueOf(10));
        return this;
    }

    public zzaHQ setAudio(ItemScope itemscope)
    {
        zzaIa = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(11));
        return this;
    }

    public zzaHQ setAuthor(List list)
    {
        zzaIb = list;
        zzaHQ.add(Integer.valueOf(12));
        return this;
    }

    public zzaHQ setBestRating(String s)
    {
        zzaIc = s;
        zzaHQ.add(Integer.valueOf(13));
        return this;
    }

    public zzaHQ setBirthDate(String s)
    {
        zzaId = s;
        zzaHQ.add(Integer.valueOf(14));
        return this;
    }

    public zzaHQ setByArtist(ItemScope itemscope)
    {
        zzaIe = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(15));
        return this;
    }

    public zzaHQ setCaption(String s)
    {
        zzaIf = s;
        zzaHQ.add(Integer.valueOf(16));
        return this;
    }

    public zzaHQ setContentSize(String s)
    {
        zzaIg = s;
        zzaHQ.add(Integer.valueOf(17));
        return this;
    }

    public zzaHQ setContentUrl(String s)
    {
        zzsB = s;
        zzaHQ.add(Integer.valueOf(18));
        return this;
    }

    public zzaHQ setContributor(List list)
    {
        zzaIh = list;
        zzaHQ.add(Integer.valueOf(19));
        return this;
    }

    public zzaHQ setDateCreated(String s)
    {
        zzaIi = s;
        zzaHQ.add(Integer.valueOf(20));
        return this;
    }

    public zzaHQ setDateModified(String s)
    {
        zzaIj = s;
        zzaHQ.add(Integer.valueOf(21));
        return this;
    }

    public zzaHQ setDatePublished(String s)
    {
        zzaIk = s;
        zzaHQ.add(Integer.valueOf(22));
        return this;
    }

    public zzaHQ setDescription(String s)
    {
        zzakM = s;
        zzaHQ.add(Integer.valueOf(23));
        return this;
    }

    public zzaHQ setDuration(String s)
    {
        zzaIl = s;
        zzaHQ.add(Integer.valueOf(24));
        return this;
    }

    public zzaHQ setEmbedUrl(String s)
    {
        zzaIm = s;
        zzaHQ.add(Integer.valueOf(25));
        return this;
    }

    public zzaHQ setEndDate(String s)
    {
        zzaIn = s;
        zzaHQ.add(Integer.valueOf(26));
        return this;
    }

    public zzaHQ setFamilyName(String s)
    {
        zzaIo = s;
        zzaHQ.add(Integer.valueOf(27));
        return this;
    }

    public zzaHQ setGender(String s)
    {
        zzaIp = s;
        zzaHQ.add(Integer.valueOf(28));
        return this;
    }

    public zzaHQ setGeo(ItemScope itemscope)
    {
        zzaIq = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(29));
        return this;
    }

    public zzaHQ setGivenName(String s)
    {
        zzaIr = s;
        zzaHQ.add(Integer.valueOf(30));
        return this;
    }

    public zzaHQ setHeight(String s)
    {
        zzaIs = s;
        zzaHQ.add(Integer.valueOf(31));
        return this;
    }

    public zzaHQ setId(String s)
    {
        zzKI = s;
        zzaHQ.add(Integer.valueOf(32));
        return this;
    }

    public zzaHQ setImage(String s)
    {
        zzaIt = s;
        zzaHQ.add(Integer.valueOf(33));
        return this;
    }

    public zzaHQ setInAlbum(ItemScope itemscope)
    {
        zzaIu = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(34));
        return this;
    }

    public zzaHQ setLatitude(double d)
    {
        zzaxB = d;
        zzaHQ.add(Integer.valueOf(36));
        return this;
    }

    public zzaHQ setLocation(ItemScope itemscope)
    {
        zzaIv = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(37));
        return this;
    }

    public zzaHQ setLongitude(double d)
    {
        zzaxC = d;
        zzaHQ.add(Integer.valueOf(38));
        return this;
    }

    public zzaHQ setName(String s)
    {
        mName = s;
        zzaHQ.add(Integer.valueOf(39));
        return this;
    }

    public zzaHQ setPartOfTVSeries(ItemScope itemscope)
    {
        zzaIw = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(40));
        return this;
    }

    public zzaHQ setPerformers(List list)
    {
        zzaIx = list;
        zzaHQ.add(Integer.valueOf(41));
        return this;
    }

    public zzaHQ setPlayerType(String s)
    {
        zzaIy = s;
        zzaHQ.add(Integer.valueOf(42));
        return this;
    }

    public zzaHQ setPostOfficeBoxNumber(String s)
    {
        zzaIz = s;
        zzaHQ.add(Integer.valueOf(43));
        return this;
    }

    public zzaHQ setPostalCode(String s)
    {
        zzaIA = s;
        zzaHQ.add(Integer.valueOf(44));
        return this;
    }

    public zzaHQ setRatingValue(String s)
    {
        zzaIB = s;
        zzaHQ.add(Integer.valueOf(45));
        return this;
    }

    public zzaHQ setReviewRating(ItemScope itemscope)
    {
        zzaIC = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(46));
        return this;
    }

    public zzaHQ setStartDate(String s)
    {
        zzaID = s;
        zzaHQ.add(Integer.valueOf(47));
        return this;
    }

    public zzaHQ setStreetAddress(String s)
    {
        zzaIE = s;
        zzaHQ.add(Integer.valueOf(48));
        return this;
    }

    public zzaHQ setText(String s)
    {
        zzaIF = s;
        zzaHQ.add(Integer.valueOf(49));
        return this;
    }

    public zzaHQ setThumbnail(ItemScope itemscope)
    {
        zzaIG = (ItemScopeEntity)itemscope;
        zzaHQ.add(Integer.valueOf(50));
        return this;
    }

    public zzaHQ setThumbnailUrl(String s)
    {
        zzaIH = s;
        zzaHQ.add(Integer.valueOf(51));
        return this;
    }

    public zzaHQ setTickerSymbol(String s)
    {
        zzaII = s;
        zzaHQ.add(Integer.valueOf(52));
        return this;
    }

    public zzaHQ setType(String s)
    {
        zzEl = s;
        zzaHQ.add(Integer.valueOf(53));
        return this;
    }

    public zzaHQ setUrl(String s)
    {
        zzF = s;
        zzaHQ.add(Integer.valueOf(54));
        return this;
    }

    public zzaHQ setWidth(String s)
    {
        zzaIJ = s;
        zzaHQ.add(Integer.valueOf(55));
        return this;
    }

    public zzaHQ setWorstRating(String s)
    {
        zzaIK = s;
        zzaHQ.add(Integer.valueOf(56));
        return this;
    }

    public Entity()
    {
    }
}
