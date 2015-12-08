// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdd, zzdc, zzbg, DataLayer, 
//            zzdf

public class zzdg extends zzdd
{

    private static final String ID;
    private static Map zzaGA;
    private static Map zzaGB;
    private static final String zzaGo;
    private static final String zzaGp;
    private static final String zzaGq;
    private static final String zzaGr;
    private static final String zzaGs;
    private static final String zzaGt;
    private static final String zzaGu;
    private static final String zzaGv;
    private static final String zzaGw;
    private static final List zzaGx = Arrays.asList(new String[] {
        "detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"
    });
    private static final Pattern zzaGy = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzaGz = Pattern.compile("metric(\\d+)");
    private final DataLayer zzaCl;
    private final Set zzaGC;
    private final zzdc zzaGD;

    public zzdg(Context context, DataLayer datalayer)
    {
        this(context, datalayer, new zzdc(context));
    }

    zzdg(Context context, DataLayer datalayer, zzdc zzdc1)
    {
        super(ID, new String[0]);
        zzaCl = datalayer;
        zzaGD = zzdc1;
        zzaGC = new HashSet();
        zzaGC.add("");
        zzaGC.add("0");
        zzaGC.add("false");
    }

    private Double zzI(Object obj)
    {
        if (obj instanceof String)
        {
            try
            {
                obj = Double.valueOf((String)obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder()).append("Cannot convert the object to Double: ").append(((NumberFormatException) (obj)).getMessage()).toString());
            }
            return ((Double) (obj));
        }
        if (obj instanceof Integer)
        {
            return Double.valueOf(((Integer)obj).doubleValue());
        }
        if (obj instanceof Double)
        {
            return (Double)obj;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("Cannot convert the object to Double: ").append(obj.toString()).toString());
        }
    }

    private Integer zzJ(Object obj)
    {
        if (obj instanceof String)
        {
            try
            {
                obj = Integer.valueOf((String)obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder()).append("Cannot convert the object to Integer: ").append(((NumberFormatException) (obj)).getMessage()).toString());
            }
            return ((Integer) (obj));
        }
        if (obj instanceof Double)
        {
            return Integer.valueOf(((Double)obj).intValue());
        }
        if (obj instanceof Integer)
        {
            return (Integer)obj;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("Cannot convert the object to Integer: ").append(obj.toString()).toString());
        }
    }

    private Promotion zzN(Map map)
    {
        Promotion promotion = new Promotion();
        String s = (String)map.get("id");
        if (s != null)
        {
            promotion.setId(String.valueOf(s));
        }
        s = (String)map.get("name");
        if (s != null)
        {
            promotion.setName(String.valueOf(s));
        }
        s = (String)map.get("creative");
        if (s != null)
        {
            promotion.setCreative(String.valueOf(s));
        }
        map = (String)map.get("position");
        if (map != null)
        {
            promotion.setPosition(String.valueOf(map));
        }
        return promotion;
    }

    private Product zzO(Map map)
    {
        Product product;
        Object obj;
        product = new Product();
        obj = map.get("id");
        if (obj != null)
        {
            product.setId(String.valueOf(obj));
        }
        obj = map.get("name");
        if (obj != null)
        {
            product.setName(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null)
        {
            product.setBrand(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null)
        {
            product.setCategory(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null)
        {
            product.setVariant(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null)
        {
            product.setCouponCode(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null)
        {
            product.setPosition(zzJ(obj).intValue());
        }
        obj = map.get("price");
        if (obj != null)
        {
            product.setPrice(zzI(obj).doubleValue());
        }
        obj = map.get("quantity");
        if (obj != null)
        {
            product.setQuantity(zzJ(obj).intValue());
        }
        obj = map.keySet().iterator();
_L2:
        String s;
        Matcher matcher;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)((Iterator) (obj)).next();
        matcher = zzaGy.matcher(s);
        if (matcher.matches())
        {
            int i;
            try
            {
                i = Integer.parseInt(matcher.group(1));
            }
            catch (NumberFormatException numberformatexception)
            {
                zzbg.zzan((new StringBuilder()).append("illegal number in custom dimension value: ").append(s).toString());
                continue; /* Loop/switch isn't completed */
            }
            product.setCustomDimension(i, String.valueOf(map.get(s)));
            continue; /* Loop/switch isn't completed */
        }
        numberformatexception = zzaGz.matcher(s);
        if (!numberformatexception.matches())
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = Integer.parseInt(numberformatexception.group(1));
        product.setCustomMetric(j, zzJ(map.get(s)).intValue());
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception1;
        numberformatexception1;
        zzbg.zzan((new StringBuilder()).append("illegal number in custom metric value: ").append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return product;
    }

    private Map zzP(Map map)
    {
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaGv);
        if (map != null)
        {
            return zzc(map);
        }
        if (zzaGA == null)
        {
            map = new HashMap();
            map.put("transactionId", "&ti");
            map.put("transactionAffiliation", "&ta");
            map.put("transactionTax", "&tt");
            map.put("transactionShipping", "&ts");
            map.put("transactionTotal", "&tr");
            map.put("transactionCurrency", "&cu");
            zzaGA = map;
        }
        return zzaGA;
    }

    private Map zzQ(Map map)
    {
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaGw);
        if (map != null)
        {
            return zzc(map);
        }
        if (zzaGB == null)
        {
            map = new HashMap();
            map.put("name", "&in");
            map.put("sku", "&ic");
            map.put("category", "&iv");
            map.put("price", "&ip");
            map.put("quantity", "&iq");
            map.put("currency", "&cu");
            zzaGB = map;
        }
        return zzaGB;
    }

    private void zza(Tracker tracker, Map map)
    {
        String s = zzeg("transactionId");
        if (s != null) goto _L2; else goto _L1
_L1:
        zzbg.zzak("Cannot find transactionId in data layer.");
_L4:
        return;
_L2:
        LinkedList linkedlist;
        Object obj;
        linkedlist = new LinkedList();
        try
        {
            obj = zzm((com.google.android.gms.internal.zzd.zza)map.get(zzaGt));
            ((Map) (obj)).put("&t", "transaction");
            java.util.Map.Entry entry;
            for (Iterator iterator = zzP(map).entrySet().iterator(); iterator.hasNext(); zzd(((Map) (obj)), (String)entry.getValue(), zzeg((String)entry.getKey())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Tracker tracker)
        {
            com.google.android.gms.tagmanager.zzbg.zzb("Unable to send transaction", tracker);
            return;
        }
        linkedlist.add(obj);
        obj = zzeh("transactionProducts");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        obj = ((List) (obj)).iterator();
_L3:
        Map map1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_347;
        }
        map1 = (Map)((Iterator) (obj)).next();
        if (map1.get("name") == null)
        {
            zzbg.zzak("Unable to send transaction item hit due to missing 'name' field.");
            return;
        }
        Map map2;
        map2 = zzm((com.google.android.gms.internal.zzd.zza)map.get(zzaGt));
        map2.put("&t", "item");
        map2.put("&ti", s);
        java.util.Map.Entry entry1;
        for (Iterator iterator1 = zzQ(map).entrySet().iterator(); iterator1.hasNext(); zzd(map2, (String)entry1.getValue(), (String)map1.get(entry1.getKey())))
        {
            entry1 = (java.util.Map.Entry)iterator1.next();
        }

        linkedlist.add(map2);
          goto _L3
        map = linkedlist.iterator();
        while (map.hasNext()) 
        {
            tracker.send((Map)map.next());
        }
          goto _L4
    }

    private void zzb(Tracker tracker, Map map)
    {
        com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
        Object obj = zzm((com.google.android.gms.internal.zzd.zza)map.get(zzaGt));
        screenviewbuilder.setAll(((Map) (obj)));
        if (zzg(map, zzaGr))
        {
            map = ((Map) (zzaCl.get("ecommerce")));
            Object obj1;
            RuntimeException runtimeexception;
            Map map1;
            RuntimeException runtimeexception1;
            boolean flag;
            if (map instanceof Map)
            {
                map = (Map)map;
            } else
            {
                map = null;
            }
        } else
        {
            map = ((Map) (zzdf.zzl((com.google.android.gms.internal.zzd.zza)map.get(zzaGs))));
            if (map instanceof Map)
            {
                map = (Map)map;
            } else
            {
                map = null;
            }
        }
        if (map == null) goto _L2; else goto _L1
_L1:
        obj1 = (String)((Map) (obj)).get("&cu");
        obj = obj1;
        if (obj1 == null)
        {
            obj = (String)map.get("currencyCode");
        }
        if (obj != null)
        {
            screenviewbuilder.set("&cu", ((String) (obj)));
        }
        obj = map.get("impressions");
        if (obj instanceof List)
        {
            for (obj = ((List)obj).iterator(); ((Iterator) (obj)).hasNext();)
            {
                obj1 = (Map)((Iterator) (obj)).next();
                try
                {
                    screenviewbuilder.addImpression(zzO(((Map) (obj1))), (String)((Map) (obj1)).get("list"));
                }
                // Misplaced declaration of an exception variable
                catch (RuntimeException runtimeexception)
                {
                    zzbg.zzak((new StringBuilder()).append("Failed to extract a product from DataLayer. ").append(runtimeexception.getMessage()).toString());
                }
            }

        }
        if (map.containsKey("promoClick"))
        {
            obj = (List)((Map)map.get("promoClick")).get("promotions");
        } else
        if (map.containsKey("promoView"))
        {
            obj = (List)((Map)map.get("promoView")).get("promotions");
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            runtimeexception = (Map)((Iterator) (obj)).next();
            try
            {
                screenviewbuilder.addPromotion(zzN(runtimeexception));
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                zzbg.zzak((new StringBuilder()).append("Failed to extract a promotion from DataLayer. ").append(runtimeexception.getMessage()).toString());
            }
        }

        if (!map.containsKey("promoClick")) goto _L6; else goto _L5
_L5:
        screenviewbuilder.set("&promoa", "click");
        flag = false;
_L12:
        if (!flag) goto _L2; else goto _L7
_L7:
        runtimeexception = zzaGx.iterator();
_L10:
        if (!runtimeexception.hasNext()) goto _L2; else goto _L8
_L8:
        obj = (String)runtimeexception.next();
        if (!map.containsKey(obj)) goto _L10; else goto _L9
_L9:
        map = (Map)map.get(obj);
        runtimeexception = (List)map.get("products");
        if (runtimeexception != null)
        {
            for (runtimeexception = runtimeexception.iterator(); runtimeexception.hasNext();)
            {
                map1 = (Map)runtimeexception.next();
                try
                {
                    screenviewbuilder.addProduct(zzO(map1));
                }
                // Misplaced declaration of an exception variable
                catch (RuntimeException runtimeexception1)
                {
                    zzbg.zzak((new StringBuilder()).append("Failed to extract a product from DataLayer. ").append(runtimeexception1.getMessage()).toString());
                }
            }

        }
          goto _L11
_L6:
        screenviewbuilder.set("&promoa", "view");
_L4:
        flag = true;
          goto _L12
_L11:
        if (!map.containsKey("actionField")) goto _L14; else goto _L13
_L13:
        map = zzd(((String) (obj)), (Map)map.get("actionField"));
_L15:
        screenviewbuilder.setProductAction(map);
_L2:
        tracker.send(screenviewbuilder.build());
        return;
_L14:
        map = new ProductAction(((String) (obj)));
          goto _L15
        map;
        zzbg.zzak((new StringBuilder()).append("Failed to extract a product action from DataLayer. ").append(map.getMessage()).toString());
          goto _L2
    }

    private Map zzc(com.google.android.gms.internal.zzd.zza zza1)
    {
        zza1 = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl(zza1)));
        if (!(zza1 instanceof Map))
        {
            return null;
        }
        Object obj = (Map)zza1;
        zza1 = new LinkedHashMap();
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); zza1.put(entry.getKey().toString(), entry.getValue().toString()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        }

        return zza1;
    }

    private ProductAction zzd(String s, Map map)
    {
        s = new ProductAction(s);
        Object obj = map.get("id");
        if (obj != null)
        {
            s.setTransactionId(String.valueOf(obj));
        }
        obj = map.get("affiliation");
        if (obj != null)
        {
            s.setTransactionAffiliation(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null)
        {
            s.setTransactionCouponCode(String.valueOf(obj));
        }
        obj = map.get("list");
        if (obj != null)
        {
            s.setProductActionList(String.valueOf(obj));
        }
        obj = map.get("option");
        if (obj != null)
        {
            s.setCheckoutOptions(String.valueOf(obj));
        }
        obj = map.get("revenue");
        if (obj != null)
        {
            s.setTransactionRevenue(zzI(obj).doubleValue());
        }
        obj = map.get("tax");
        if (obj != null)
        {
            s.setTransactionTax(zzI(obj).doubleValue());
        }
        obj = map.get("shipping");
        if (obj != null)
        {
            s.setTransactionShipping(zzI(obj).doubleValue());
        }
        map = ((Map) (map.get("step")));
        if (map != null)
        {
            s.setCheckoutStep(zzJ(map).intValue());
        }
        return s;
    }

    private void zzd(Map map, String s, String s1)
    {
        if (s1 != null)
        {
            map.put(s, s1);
        }
    }

    private String zzeg(String s)
    {
        s = ((String) (zzaCl.get(s)));
        if (s == null)
        {
            return null;
        } else
        {
            return s.toString();
        }
    }

    private List zzeh(String s)
    {
        s = ((String) (zzaCl.get(s)));
        if (s == null)
        {
            return null;
        }
        if (!(s instanceof List))
        {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        for (Iterator iterator = ((List)s).iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof Map))
            {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }

        return (List)s;
    }

    private boolean zzg(Map map, String s)
    {
        map = (com.google.android.gms.internal.zzd.zza)map.get(s);
        if (map == null)
        {
            return false;
        } else
        {
            return zzdf.zzk(map).booleanValue();
        }
    }

    private Map zzm(com.google.android.gms.internal.zzd.zza zza1)
    {
        if (zza1 == null)
        {
            return new HashMap();
        }
        zza1 = zzc(zza1);
        if (zza1 == null)
        {
            return new HashMap();
        }
        String s = (String)zza1.get("&aip");
        if (s != null && zzaGC.contains(s.toLowerCase()))
        {
            zza1.remove("&aip");
        }
        return zza1;
    }

    public volatile com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return super.zzD(map);
    }

    public void zzF(Map map)
    {
        Tracker tracker = zzaGD.zzdY("_GTM_DEFAULT_TRACKER_");
        tracker.enableAdvertisingIdCollection(zzg(map, "collect_adid"));
        if (zzg(map, zzaGq))
        {
            zzb(tracker, map);
            return;
        }
        if (zzg(map, zzaGp))
        {
            tracker.send(zzm((com.google.android.gms.internal.zzd.zza)map.get(zzaGt)));
            return;
        }
        if (zzg(map, zzaGu))
        {
            zza(tracker, map);
            return;
        } else
        {
            zzbg.zzan("Ignoring unknown tag.");
            return;
        }
    }

    public volatile String zzwQ()
    {
        return super.zzwQ();
    }

    public volatile Set zzwR()
    {
        return super.zzwR();
    }

    public volatile boolean zzwl()
    {
        return super.zzwl();
    }

    static 
    {
        ID = zza.zzaT.toString();
        zzaGo = zzb.zzbA.toString();
        zzaGp = zzb.zzbK.toString();
        zzaGq = zzb.zzdf.toString();
        zzaGr = zzb.zzcZ.toString();
        zzaGs = zzb.zzcY.toString();
        zzaGt = zzb.zzbJ.toString();
        zzaGu = zzb.zzfC.toString();
        zzaGv = zzb.zzfF.toString();
        zzaGw = zzb.zzfH.toString();
    }
}
