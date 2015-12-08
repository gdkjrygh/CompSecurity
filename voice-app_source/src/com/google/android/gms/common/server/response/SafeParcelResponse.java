// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzky;
import com.google.android.gms.internal.zzlh;
import com.google.android.gms.internal.zzli;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, zze, FieldMappingDictionary

public class SafeParcelResponse extends FastJsonResponse
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    private final String mClassName;
    private final int zzCY;
    private final FieldMappingDictionary zzabO;
    private final Parcel zzabV;
    private final int zzabW;
    private int zzabX;
    private int zzabY;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
    {
        zzCY = i;
        zzabV = (Parcel)zzu.zzu(parcel);
        zzabW = 2;
        zzabO = fieldmappingdictionary;
        if (zzabO == null)
        {
            mClassName = null;
        } else
        {
            mClassName = zzabO.zzoC();
        }
        zzabX = 2;
    }

    private SafeParcelResponse(SafeParcelable safeparcelable, FieldMappingDictionary fieldmappingdictionary, String s)
    {
        zzCY = 1;
        zzabV = Parcel.obtain();
        safeparcelable.writeToParcel(zzabV, 0);
        zzabW = 1;
        zzabO = (FieldMappingDictionary)zzu.zzu(fieldmappingdictionary);
        mClassName = (String)zzu.zzu(s);
        zzabX = 2;
    }

    private static HashMap zzC(Map map)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(Integer.valueOf(((FastJsonResponse.Field)entry.getValue()).zzot()), entry))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return hashmap;
    }

    public static SafeParcelResponse zza(FastJsonResponse fastjsonresponse)
    {
        String s = fastjsonresponse.getClass().getCanonicalName();
        FieldMappingDictionary fieldmappingdictionary = zzb(fastjsonresponse);
        return new SafeParcelResponse((SafeParcelable)fastjsonresponse, fieldmappingdictionary, s);
    }

    private static void zza(FieldMappingDictionary fieldmappingdictionary, FastJsonResponse fastjsonresponse)
    {
        Object obj = fastjsonresponse.getClass();
        if (!fieldmappingdictionary.zzb(((Class) (obj))))
        {
            Map map = fastjsonresponse.zzom();
            fieldmappingdictionary.zza(((Class) (obj)), map);
            obj = map.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                fastjsonresponse = (FastJsonResponse.Field)map.get((String)((Iterator) (obj)).next());
                Class class1 = fastjsonresponse.zzou();
                if (class1 != null)
                {
                    try
                    {
                        zza(fieldmappingdictionary, (FastJsonResponse)class1.newInstance());
                    }
                    // Misplaced declaration of an exception variable
                    catch (FieldMappingDictionary fieldmappingdictionary)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not instantiate an object of type ").append(fastjsonresponse.zzou().getCanonicalName()).toString(), fieldmappingdictionary);
                    }
                    // Misplaced declaration of an exception variable
                    catch (FieldMappingDictionary fieldmappingdictionary)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Could not access object of type ").append(fastjsonresponse.zzou().getCanonicalName()).toString(), fieldmappingdictionary);
                    }
                }
            } while (true);
        }
    }

    private void zza(StringBuilder stringbuilder, int i, Object obj)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(i).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            stringbuilder.append(obj);
            return;

        case 7: // '\007'
            stringbuilder.append("\"").append(zzlh.zzcr(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(zzky.zzi((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(zzky.zzj((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            zzli.zza(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void zza(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        switch (field.zzol())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(field.zzol()).toString());

        case 0: // '\0'
            zzb(stringbuilder, field, zza(field, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i))));
            return;

        case 1: // '\001'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzk(parcel, i)));
            return;

        case 2: // '\002'
            zzb(stringbuilder, field, zza(field, Long.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i))));
            return;

        case 3: // '\003'
            zzb(stringbuilder, field, zza(field, Float.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i))));
            return;

        case 4: // '\004'
            zzb(stringbuilder, field, zza(field, Double.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i))));
            return;

        case 5: // '\005'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzn(parcel, i)));
            return;

        case 6: // '\006'
            zzb(stringbuilder, field, zza(field, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i))));
            return;

        case 7: // '\007'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            zzb(stringbuilder, field, zza(field, com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i)));
            return;

        case 10: // '\n'
            zzb(stringbuilder, field, zza(field, zzh(com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void zza(StringBuilder stringbuilder, String s, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (field.zzow())
        {
            zza(stringbuilder, field, parcel, i);
            return;
        } else
        {
            zzb(stringbuilder, field, parcel, i);
            return;
        }
    }

    private void zza(StringBuilder stringbuilder, Map map, Parcel parcel)
    {
        map = zzC(map);
        stringbuilder.append('{');
        int i = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= i)
            {
                break;
            }
            int j = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)map.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.zza.zzbA(j)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                zza(stringbuilder, (String)entry.getKey(), (FastJsonResponse.Field)entry.getValue(), parcel, j);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != i)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private static FieldMappingDictionary zzb(FastJsonResponse fastjsonresponse)
    {
        FieldMappingDictionary fieldmappingdictionary = new FieldMappingDictionary(fastjsonresponse.getClass());
        zza(fieldmappingdictionary, fastjsonresponse);
        fieldmappingdictionary.zzoA();
        fieldmappingdictionary.zzoz();
        return fieldmappingdictionary;
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, Parcel parcel, int i)
    {
        if (!field.zzor()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        field.zzol();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 110
    //                   2 123
    //                   3 136
    //                   4 149
    //                   5 162
    //                   6 175
    //                   7 188
    //                   8 201
    //                   9 201
    //                   10 201
    //                   11 212;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzu(parcel, i));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzw(parcel, i));
        continue; /* Loop/switch isn't completed */
_L6:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzv(parcel, i));
        continue; /* Loop/switch isn't completed */
_L7:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzx(parcel, i));
        continue; /* Loop/switch isn't completed */
_L8:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzy(parcel, i));
        continue; /* Loop/switch isn't completed */
_L9:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzz(parcel, i));
        continue; /* Loop/switch isn't completed */
_L10:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzt(parcel, i));
        continue; /* Loop/switch isn't completed */
_L11:
        zzkx.zza(stringbuilder, com.google.android.gms.common.internal.safeparcel.zza.zzA(parcel, i));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        parcel = com.google.android.gms.common.internal.safeparcel.zza.zzE(parcel, i);
        int j = parcel.length;
        i = 0;
        while (i < j) 
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            parcel[i].setDataPosition(0);
            zza(stringbuilder, field.zzoy(), parcel[i]);
            i++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (field.zzol())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzk(parcel, i));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, i));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, i));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzn(parcel, i));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i));
            return;

        case 7: // '\007'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i);
            stringbuilder.append("\"").append(zzlh.zzcr(field)).append("\"");
            return;

        case 8: // '\b'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i);
            stringbuilder.append("\"").append(zzky.zzi(field)).append("\"");
            return;

        case 9: // '\t'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzr(parcel, i);
            stringbuilder.append("\"").append(zzky.zzj(field));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            field = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i);
            parcel = field.keySet();
            parcel.size();
            stringbuilder.append("{");
            parcel = parcel.iterator();
            for (i = 1; parcel.hasNext(); i = 0)
            {
                String s = (String)parcel.next();
                if (i == 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
                stringbuilder.append("\"").append(zzlh.zzcr(field.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            parcel = com.google.android.gms.common.internal.safeparcel.zza.zzD(parcel, i);
            parcel.setDataPosition(0);
            zza(stringbuilder, field.zzoy(), parcel);
            return;
        }
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
    {
        if (field.zzoq())
        {
            zzb(stringbuilder, field, (ArrayList)obj);
            return;
        } else
        {
            zza(stringbuilder, field.zzok(), obj);
            return;
        }
    }

    private void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(",");
            }
            zza(stringbuilder, field.zzok(), arraylist.get(i));
        }

        stringbuilder.append("]");
    }

    public static HashMap zzh(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        zzu.zzb(zzabO, "Cannot convert to JSON on client side.");
        Parcel parcel = zzoE();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        zza(stringbuilder, zzabO.zzco(mClassName), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        com.google.android.gms.common.server.response.zze.zza(this, parcel, i);
    }

    protected Object zzck(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected boolean zzcl(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Parcel zzoE()
    {
        zzabX;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return zzabV;
_L2:
        zzabY = com.google.android.gms.common.internal.safeparcel.zzb.zzac(zzabV);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(zzabV, zzabY);
        zzabX = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(zzabV, zzabY);
        zzabX = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    FieldMappingDictionary zzoF()
    {
        switch (zzabW)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(zzabW).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return zzabO;

        case 2: // '\002'
            return zzabO;
        }
    }

    public Map zzom()
    {
        if (zzabO == null)
        {
            return null;
        } else
        {
            return zzabO.zzco(mClassName);
        }
    }

}
