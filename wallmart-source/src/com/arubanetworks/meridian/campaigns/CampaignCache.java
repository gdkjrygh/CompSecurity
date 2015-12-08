// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.campaigns;

import android.content.Context;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.location.Beacon;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.requests.ClientLocationDataRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.campaigns:
//            CampaignInfo

class CampaignCache
    implements Serializable
{

    private static final MeridianLogger a;
    private final HashMap b;
    private final HashMap c;
    private final HashMap d;
    private final HashMap e;
    private final String f;
    private final HashMap g;
    private String h;
    private long i;

    public CampaignCache(String s, String s1, String s2, JSONArray jsonarray, JSONArray jsonarray1)
    {
        b = new HashMap();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        g = new HashMap();
        i = System.currentTimeMillis();
        h = s;
        Beacon beacon;
        int j;
        if (s2 != null)
        {
            s = s2;
        } else
        {
            s = "";
        }
        f = s;
        if (Strings.isNullOrEmpty(s1) || jsonarray == null) goto _L2; else goto _L1
_L1:
        j = 0;
_L3:
        if (j >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s = jsonarray.getJSONObject(j);
        beacon = a(s1, c, s);
        a(s1, CampaignInfo.CampaignBeaconType.a, beacon, s.optJSONObject("campaigns"));
        j++;
        if (true) goto _L3; else goto _L2
_L2:
        if (Strings.isNullOrEmpty(s2) || jsonarray1 == null) goto _L5; else goto _L4
_L4:
        int k = 0;
_L6:
        if (k >= jsonarray1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s = jsonarray1.getJSONObject(k);
        s1 = a(s2, b, s);
        a(s2, CampaignInfo.CampaignBeaconType.b, s1, s.optJSONObject("campaigns"));
        k++;
        if (true) goto _L6; else goto _L5
_L5:
        a.d("Campaigns read from json!");
        for (s = d.values().iterator(); s.hasNext(); a.d(s1.toString()))
        {
            s1 = (CampaignInfo)s.next();
        }

          goto _L7
_L9:
        return;
_L7:
        try
        {
            s = e.values().iterator();
            while (s.hasNext()) 
            {
                s1 = (CampaignInfo)s.next();
                a.d(s1.toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a.e("Error parsing JSON from campaign cache", s);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    private Beacon a(String s, HashMap hashmap, JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            s = Beacon.fromScanJSON(s, jsonobject);
            hashmap.put(s.getMajorMinorString(), s);
            return s;
        }
    }

    static MeridianLogger a()
    {
        return a;
    }

    static HashMap a(Context context)
    {
        File file;
        a.d("(called)retrieveCampaignCache");
        file = new File(context.getCacheDir(), "campaign_cache");
        if (file.exists()) goto _L2; else goto _L1
_L1:
        context = new HashMap();
_L4:
        return context;
_L2:
        ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(file));
        context = objectinputstream;
        HashMap hashmap = (HashMap)objectinputstream.readObject();
        if (hashmap != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = objectinputstream;
        hashmap = new HashMap();
        context = hashmap;
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Issue getting cache", context);
                return hashmap;
            }
            return hashmap;
        }
        if (true) goto _L4; else goto _L3
_L3:
        context = hashmap;
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Issue getting cache", context);
                return hashmap;
            }
            return hashmap;
        }
        if (true) goto _L4; else goto _L5
_L5:
        Object obj;
        obj;
        objectinputstream = null;
_L11:
        context = objectinputstream;
        a.e("Issue getting cache", ((Throwable) (obj)));
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Issue getting cache", context);
            }
        }
_L6:
        file.delete();
        a.d("Bad cache returning an empty hashmap");
        return new HashMap();
        obj;
        objectinputstream = null;
_L9:
        context = objectinputstream;
        a.e("Issue getting cache", ((Throwable) (obj)));
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Issue getting cache", context);
            }
        }
          goto _L6
        Exception exception;
        exception;
        context = null;
_L8:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Issue getting cache", context);
            }
        }
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
          goto _L9
        obj;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void a(Context context, EditorKey editorkey, Runnable runnable)
    {
        a.d("(called)loadCampaignCache");
        HashMap hashmap = a(context);
        (new com.arubanetworks.meridian.requests.ClientLocationDataRequest.Builder()).setAppId(editorkey.getId()).setListener(new _cls2(editorkey, hashmap, context, runnable)).setErrorListener(new _cls1()).build().sendRequest();
    }

    private void a(Context context, String s, com.arubanetworks.meridian.location.Beacon.TriggerState triggerstate)
    {
        if (triggerstate != com.arubanetworks.meridian.location.Beacon.TriggerState.NO_CHANGE) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a.d("Beacon Triggered! : state=%s : %s", new Object[] {
            triggerstate.name(), s
        });
        Object obj = null;
    /* anonymous class not found */
    class _anm3 {}

        switch (_cls3.a[triggerstate.ordinal()])
        {
        default:
            s = obj;
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_99;
        }
_L4:
        if (s != null && s.a())
        {
            s.a(context);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s = (CampaignInfo)e.get(s);
          goto _L4
        s = (CampaignInfo)d.get(s);
          goto _L4
    }

    static void a(Context context, HashMap hashmap)
    {
        a.d("(called)storeCampaignCache");
        context = new File(context.getCacheDir(), "campaign_cache");
        if (context.exists())
        {
            context.delete();
        }
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream(context));
        context = objectoutputstream;
        objectoutputstream.writeObject(hashmap);
        context = objectoutputstream;
        objectoutputstream.flush();
        context = objectoutputstream;
        objectoutputstream.close();
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Error storing campaign cache", context);
            }
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        hashmap = null;
_L7:
        context = hashmap;
        a.e("Error storing campaign cache", ioexception);
        if (hashmap == null) goto _L1; else goto _L4
_L4:
        try
        {
            hashmap.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a.e("Error storing campaign cache", context);
        }
        return;
        hashmap;
        context = null;
_L6:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                a.e("Error storing campaign cache", context);
            }
        }
        throw hashmap;
        hashmap;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        hashmap = objectoutputstream;
          goto _L7
    }

    private void a(String s, CampaignInfo.CampaignBeaconType campaignbeacontype, Beacon beacon, JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null && beacon != null)
        {
            JSONArray jsonarray = jsonobject.optJSONArray("on_enter");
            if (jsonarray != null && jsonarray.length() > 0)
            {
                d.put(beacon.getMajorMinorString(), new CampaignInfo(h, s, beacon, campaignbeacontype, CampaignInfo.CampaignType.a, jsonarray));
            }
            jsonobject = jsonobject.optJSONArray("on_exit");
            if (jsonobject != null && jsonobject.length() > 0)
            {
                e.put(beacon.getMajorMinorString(), new CampaignInfo(h, s, beacon, campaignbeacontype, CampaignInfo.CampaignType.b, jsonobject));
                return;
            }
        }
    }

    static boolean a(CampaignCache campaigncache)
    {
        return campaigncache.b();
    }

    private boolean b()
    {
        return b.size() + c.size() > 0;
    }

    public void a(Context context, boolean flag)
    {
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Beacon beacon = (Beacon)iterator.next();
            a(context, beacon.getMajorMinorString(), beacon.triggerCampaign());
            if (flag)
            {
                beacon.setRssi(1);
            }
        } while (true);
    }

    public boolean a(Context context, Beacon beacon, int j)
    {
        if (!f.equalsIgnoreCase(beacon.getProximityUuid()))
        {
            return false;
        }
        beacon = (Beacon)b.get(beacon.getMajorMinorString());
        if (beacon == null)
        {
            return false;
        }
        if (j != 0)
        {
            beacon.setRssi(j);
            beacon.updateTimeStamp();
        }
        a(context, beacon.getMajorMinorString(), beacon.triggerCampaign());
        return true;
    }

    static 
    {
        a = MeridianLogger.forTag("CampaignCache").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.CAMPAIGNS);
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
