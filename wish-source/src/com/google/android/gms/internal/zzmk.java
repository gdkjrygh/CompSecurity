// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzb

final class zzmk
{

    static zzd.zza zza(int i, JSONArray jsonarray, zzd.zza azza[], Set set)
        throws zzmq.zzg, JSONException
    {
        boolean flag = false;
        int j = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            zzel((new StringBuilder()).append("Value cycle detected. Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        Object obj = zza(jsonarray, i, "values");
        if (azza[i] != null)
        {
            return azza[i];
        }
        set.add(Integer.valueOf(i));
        zzd.zza zza1 = new zzd.zza();
        if (obj instanceof JSONArray)
        {
            obj = (JSONArray)obj;
            zza1.type = 2;
            zza1.zzhu = true;
            for (zza1.zzhl = new zzd.zza[((JSONArray) (obj)).length()]; j < zza1.zzhl.length; j++)
            {
                zza1.zzhl[j] = zza(((JSONArray) (obj)).getInt(j), jsonarray, azza, set);
            }

        } else
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("escaping");
            if (jsonarray1 != null)
            {
                zza1.zzht = new int[jsonarray1.length()];
                for (int k = 0; k < zza1.zzht.length; k++)
                {
                    zza1.zzht[k] = jsonarray1.getInt(k);
                }

            }
            if (((JSONObject) (obj)).has("function_id"))
            {
                zza1.type = 5;
                zza1.zzhp = ((JSONObject) (obj)).getString("function_id");
            } else
            if (((JSONObject) (obj)).has("macro_reference"))
            {
                zza1.type = 4;
                zza1.zzhu = true;
                zza1.zzho = zzdf.zzg(zza(((JSONObject) (obj)).getInt("macro_reference"), jsonarray, azza, set));
            } else
            if (((JSONObject) (obj)).has("template_token"))
            {
                zza1.type = 7;
                zza1.zzhu = true;
                obj = ((JSONObject) (obj)).getJSONArray("template_token");
                zza1.zzhs = new zzd.zza[((JSONArray) (obj)).length()];
                int l = ((flag) ? 1 : 0);
                while (l < zza1.zzhs.length) 
                {
                    zza1.zzhs[l] = zza(((JSONArray) (obj)).getInt(l), jsonarray, azza, set);
                    l++;
                }
            } else
            {
                zza1.type = 3;
                zza1.zzhu = true;
                int i1 = ((JSONObject) (obj)).length();
                zza1.zzhm = new zzd.zza[i1];
                zza1.zzhn = new zzd.zza[i1];
                Iterator iterator = ((JSONObject) (obj)).keys();
                i1 = 0;
                while (iterator.hasNext()) 
                {
                    String s = (String)iterator.next();
                    zza1.zzhm[i1] = zza((new Integer(s)).intValue(), jsonarray, azza, set);
                    zza1.zzhn[i1] = zza(((JSONObject) (obj)).getInt(s), jsonarray, azza, set);
                    i1++;
                }
            }
        } else
        if (obj instanceof String)
        {
            zza1.zzhk = (String)obj;
            zza1.type = 1;
        } else
        if (obj instanceof Boolean)
        {
            zza1.zzhr = ((Boolean)obj).booleanValue();
            zza1.type = 8;
        } else
        if (obj instanceof Integer)
        {
            zza1.zzhq = ((Integer)obj).intValue();
            zza1.type = 6;
        } else
        {
            zzel((new StringBuilder()).append("Invalid value type: ").append(obj).toString());
        }
        azza[i] = zza1;
        set.remove(Integer.valueOf(i));
        return zza1;
    }

    static zzmq.zza zza(JSONObject jsonobject, JSONArray jsonarray, JSONArray jsonarray1, zzd.zza azza[], int i)
        throws zzmq.zzg, JSONException
    {
        zzmq.zzb zzb1 = zzmq.zza.zzyq();
        jsonobject = jsonobject.getJSONArray("property");
        i = 0;
        while (i < jsonobject.length()) 
        {
            Object obj = (JSONObject)zza(jsonarray, jsonobject.getInt(i), "properties");
            String s = (String)zza(jsonarray1, ((JSONObject) (obj)).getInt("key"), "key");
            obj = (zzd.zza)zza(((Object []) (azza)), ((JSONObject) (obj)).getInt("value"), "value");
            if (zzb.zzeK.toString().equals(s))
            {
                zzb1.zzq(((zzd.zza) (obj)));
            } else
            {
                zzb1.zzb(s, ((zzd.zza) (obj)));
            }
            i++;
        }
        return zzb1.zzys();
    }

    static zzmq.zze zza(JSONObject jsonobject, List list, List list1, List list2, zzd.zza azza[])
        throws JSONException
    {
        zzmq.zzf zzf = zzmq.zze.zzyx();
        JSONArray jsonarray = jsonobject.optJSONArray("positive_predicate");
        JSONArray jsonarray1 = jsonobject.optJSONArray("negative_predicate");
        JSONArray jsonarray2 = jsonobject.optJSONArray("add_tag");
        JSONArray jsonarray3 = jsonobject.optJSONArray("remove_tag");
        JSONArray jsonarray4 = jsonobject.optJSONArray("add_tag_rule_name");
        JSONArray jsonarray5 = jsonobject.optJSONArray("remove_tag_rule_name");
        JSONArray jsonarray6 = jsonobject.optJSONArray("add_macro");
        JSONArray jsonarray7 = jsonobject.optJSONArray("remove_macro");
        JSONArray jsonarray8 = jsonobject.optJSONArray("add_macro_rule_name");
        jsonobject = jsonobject.optJSONArray("remove_macro_rule_name");
        if (jsonarray != null)
        {
            for (int i = 0; i < jsonarray.length(); i++)
            {
                zzf.zzd((zzmq.zza)list2.get(jsonarray.getInt(i)));
            }

        }
        if (jsonarray1 != null)
        {
            for (int j = 0; j < jsonarray1.length(); j++)
            {
                zzf.zze((zzmq.zza)list2.get(jsonarray1.getInt(j)));
            }

        }
        if (jsonarray2 != null)
        {
            for (int k = 0; k < jsonarray2.length(); k++)
            {
                zzf.zzf((zzmq.zza)list.get(jsonarray2.getInt(k)));
            }

        }
        if (jsonarray3 != null)
        {
            for (int l = 0; l < jsonarray3.length(); l++)
            {
                zzf.zzg((zzmq.zza)list.get(jsonarray3.getInt(l)));
            }

        }
        if (jsonarray4 != null)
        {
            for (int i1 = 0; i1 < jsonarray4.length(); i1++)
            {
                zzf.zzeo(azza[jsonarray4.getInt(i1)].zzhk);
            }

        }
        if (jsonarray5 != null)
        {
            for (int j1 = 0; j1 < jsonarray5.length(); j1++)
            {
                zzf.zzep(azza[jsonarray5.getInt(j1)].zzhk);
            }

        }
        if (jsonarray6 != null)
        {
            for (int k1 = 0; k1 < jsonarray6.length(); k1++)
            {
                zzf.zzh((zzmq.zza)list1.get(jsonarray6.getInt(k1)));
            }

        }
        if (jsonarray7 != null)
        {
            for (int l1 = 0; l1 < jsonarray7.length(); l1++)
            {
                zzf.zzi((zzmq.zza)list1.get(jsonarray7.getInt(l1)));
            }

        }
        if (jsonarray8 != null)
        {
            for (int i2 = 0; i2 < jsonarray8.length(); i2++)
            {
                zzf.zzeq(azza[jsonarray8.getInt(i2)].zzhk);
            }

        }
        if (jsonobject != null)
        {
            for (int j2 = 0; j2 < jsonobject.length(); j2++)
            {
                zzf.zzer(azza[jsonobject.getInt(j2)].zzhk);
            }

        }
        return zzf.zzyI();
    }

    private static Object zza(JSONArray jsonarray, int i, String s)
        throws zzmq.zzg
    {
        if (i < 0 || i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        jsonarray = ((JSONArray) (jsonarray.get(i)));
        return jsonarray;
        jsonarray;
        zzel((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        return null;
    }

    private static Object zza(Object aobj[], int i, String s)
        throws zzmq.zzg
    {
        if (i < 0 || i >= aobj.length)
        {
            zzel((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    static List zza(JSONArray jsonarray, JSONArray jsonarray1, JSONArray jsonarray2, zzd.zza azza[])
        throws JSONException, zzmq.zzg
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(zza(jsonarray.getJSONObject(i), jsonarray1, jsonarray2, azza, i));
        }

        return arraylist;
    }

    static zzmq.zzc zzdQ(String s)
        throws JSONException, zzmq.zzg
    {
        s = new JSONObject(s);
        Object obj = s.get("resource");
        zzd.zza azza[];
        List list;
        List list1;
        Object obj1;
        Object obj2;
        if (obj instanceof JSONObject)
        {
            obj1 = (JSONObject)obj;
            obj = zzmq.zzc.zzyt();
            azza = zzh(((JSONObject) (obj1)));
            obj2 = ((JSONObject) (obj1)).getJSONArray("properties");
            JSONArray jsonarray = ((JSONObject) (obj1)).getJSONArray("key");
            list = zza(((JSONObject) (obj1)).getJSONArray("tags"), ((JSONArray) (obj2)), jsonarray, azza);
            list1 = zza(((JSONObject) (obj1)).getJSONArray("predicates"), ((JSONArray) (obj2)), jsonarray, azza);
            obj2 = zza(((JSONObject) (obj1)).getJSONArray("macros"), ((JSONArray) (obj2)), jsonarray, azza);
            for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((zzmq.zzd) (obj)).zzc((zzmq.zza)iterator.next())) { }
        } else
        {
            throw new zzmq.zzg("Resource map not found");
        }
        obj1 = ((JSONObject) (obj1)).getJSONArray("rules");
        for (int i = 0; i < ((JSONArray) (obj1)).length(); i++)
        {
            ((zzmq.zzd) (obj)).zzb(zza(((JSONArray) (obj1)).getJSONObject(i), list, ((List) (obj2)), list1, azza));
        }

        ((zzmq.zzd) (obj)).zzen("1");
        ((zzmq.zzd) (obj)).zzhM(1);
        if (s.optJSONArray("runtime") == null);
        return ((zzmq.zzd) (obj)).zzyw();
    }

    private static void zzel(String s)
        throws zzmq.zzg
    {
        zzbg.zzak(s);
        throw new zzmq.zzg(s);
    }

    static zzd.zza[] zzh(JSONObject jsonobject)
        throws JSONException, zzmq.zzg
    {
        jsonobject = ((JSONObject) (jsonobject.opt("values")));
        zzd.zza azza[];
        if (jsonobject instanceof JSONArray)
        {
            jsonobject = (JSONArray)jsonobject;
            azza = new zzd.zza[jsonobject.length()];
            for (int i = 0; i < azza.length; i++)
            {
                zza(i, jsonobject, azza, new HashSet(0));
            }

        } else
        {
            throw new zzmq.zzg("Missing Values list");
        }
        return azza;
    }
}
