// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzjy, zzjt

public class zzju
{

    private static final zzl zzQW = new zzl("GameManagerMessage");
    protected final String zzTL;
    protected final long zzTM;
    protected final JSONObject zzTN;
    protected final int zzTR;
    protected final int zzTS;
    protected final String zzTT;
    protected final int zzTU;
    protected final int zzTV;
    protected final List zzTW;
    protected final JSONObject zzTX;
    protected final String zzTY;
    protected final String zzTZ;
    protected final zzjt zzTs;

    public zzju(int i, int j, String s, JSONObject jsonobject, int k, int l, List list, 
            JSONObject jsonobject1, String s1, String s2, long l1, String s3, zzjt zzjt1)
    {
        zzTR = i;
        zzTS = j;
        zzTT = s;
        zzTN = jsonobject;
        zzTU = k;
        zzTV = l;
        zzTW = list;
        zzTX = jsonobject1;
        zzTY = s1;
        zzTL = s2;
        zzTM = l1;
        zzTZ = s3;
        zzTs = zzjt1;
    }

    private static List zza(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonarray == null)
        {
            return arraylist;
        }
        int i = 0;
        do
        {
            while (i < jsonarray.length()) 
            {
                Object obj = jsonarray.optJSONObject(i);
                if (obj != null)
                {
                    try
                    {
                        obj = new zzjy(((JSONObject) (obj)));
                    }
                    catch (JSONException jsonexception)
                    {
                        zzQW.zzc(jsonexception, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", new Object[] {
                            Integer.valueOf(i)
                        });
                        jsonexception = null;
                    }
                    if (obj != null)
                    {
                        arraylist.add(obj);
                    }
                }
                i++;
            }
            return arraylist;
        } while (true);
    }

    protected static zzju zzh(JSONObject jsonobject)
    {
        int i = jsonobject.optInt("type", -1);
        i;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 144
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        try
        {
            zzQW.zzf("Unrecognized Game Message type %d", new Object[] {
                Integer.valueOf(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            zzQW.zzc(jsonobject, "Exception while parsing GameManagerMessage from json", new Object[0]);
        }
        break; /* Loop/switch isn't completed */
_L3:
        jsonobject = new zzju(i, jsonobject.optInt("statusCode"), jsonobject.optString("errorDescription"), jsonobject.optJSONObject("extraMessageData"), jsonobject.optInt("gameplayState"), jsonobject.optInt("lobbyState"), zza(jsonobject.optJSONArray("players")), jsonobject.optJSONObject("gameData"), jsonobject.optString("gameStatusText"), jsonobject.optString("playerId"), -1L, null, null);
        return jsonobject;
_L2:
        zzjt zzjt1 = null;
        JSONObject jsonobject1 = jsonobject.optJSONObject("gameManagerConfig");
        if (jsonobject1 == null) goto _L5; else goto _L4
_L4:
        zzjt1 = new zzjt(jsonobject1);
_L5:
        jsonobject = new zzju(i, jsonobject.optInt("statusCode"), jsonobject.optString("errorDescription"), jsonobject.optJSONObject("extraMessageData"), jsonobject.optInt("gameplayState"), jsonobject.optInt("lobbyState"), zza(jsonobject.optJSONArray("players")), jsonobject.optJSONObject("gameData"), jsonobject.optString("gameStatusText"), jsonobject.optString("playerId"), jsonobject.optLong("requestId"), jsonobject.optString("playerToken"), zzjt1);
        return jsonobject;
        return null;
    }

    public final JSONObject getExtraMessageData()
    {
        return zzTN;
    }

    public final JSONObject getGameData()
    {
        return zzTX;
    }

    public final int getGameplayState()
    {
        return zzTU;
    }

    public final int getLobbyState()
    {
        return zzTV;
    }

    public final String getPlayerId()
    {
        return zzTL;
    }

    public final long getRequestId()
    {
        return zzTM;
    }

    public final int getStatusCode()
    {
        return zzTS;
    }

    public final int zzlC()
    {
        return zzTR;
    }

    public final String zzlD()
    {
        return zzTT;
    }

    public final List zzlE()
    {
        return zzTW;
    }

    public final String zzlF()
    {
        return zzTY;
    }

    public final String zzlG()
    {
        return zzTZ;
    }

    public final zzjt zzlH()
    {
        return zzTs;
    }

}
