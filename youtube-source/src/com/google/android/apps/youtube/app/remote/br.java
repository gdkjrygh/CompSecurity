// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.apps.ytremote.backend.browserchannel.u;
import com.google.android.apps.ytremote.backend.model.DeviceType;
import com.google.android.apps.ytremote.backend.model.Method;
import com.google.android.apps.ytremote.backend.model.c;
import com.google.android.apps.ytremote.backend.model.d;
import com.google.android.apps.ytremote.model.ClientName;
import com.google.android.apps.ytremote.model.CloudScreen;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bk, bn, at

final class br
    implements u
{

    final bk a;

    private br(bk bk1)
    {
        a = bk1;
        super();
    }

    br(bk bk1, byte byte0)
    {
        this(bk1);
    }

    private static c a(JSONObject jsonobject, DeviceType devicetype)
    {
        boolean flag;
        if (!jsonobject.has("hasCc"))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        flag = jsonobject.getBoolean("hasCc");
_L1:
        jsonobject = (new d()).a(devicetype).a(jsonobject.getString("id")).b(jsonobject.getString("name")).a(new ClientName(jsonobject.getString("clientName"))).c(jsonobject.getString("user")).a(flag).a();
        return jsonobject;
        flag = false;
          goto _L1
        jsonobject;
        L.a("Error parsing device object", jsonobject);
        return null;
    }

    private Map a(JSONObject jsonobject)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put(DeviceType.LOUNGE_SCREEN, new HashSet());
        hashmap.put(DeviceType.REMOTE_CONTROL, new HashSet());
        jsonobject = new JSONArray(jsonobject.getString("devices"));
        int i = 0;
_L1:
        int j = jsonobject.length();
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        JSONObject jsonobject1;
        DeviceType devicetype;
        jsonobject1 = jsonobject.getJSONObject(i);
        devicetype = (DeviceType)bk.B().get(jsonobject1.getString("type"));
        if (devicetype == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ((Set)hashmap.get(devicetype)).add(a(jsonobject1, devicetype));
_L2:
        i++;
          goto _L1
        JSONException jsonexception;
        jsonexception;
        L.a("Error parsing lounge status message", jsonexception);
          goto _L2
        jsonobject;
        L.a("Error parsing lounge status message", jsonobject);
        return hashmap;
    }

    private void b(JSONObject jsonobject)
    {
        if (!jsonobject.has("currentTime") && !jsonobject.has("current_time"))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        double d1;
        if (!jsonobject.has("currentTime"))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        d1 = jsonobject.getInt("currentTime") * 1000;
_L2:
        if (!bk.F(a))
        {
            bk.a(a, d1);
            return;
        }
        break MISSING_BLOCK_LABEL_73;
        d1 = jsonobject.getInt("current_time") * 1000;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            if (Math.abs(d1 - bk.G(a)) <= 2000D)
            {
                bk.a(a, false);
                bk.s(a).removeMessages(5);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("Error parsing current time", jsonobject);
        }
    }

    private void c(JSONObject jsonobject)
    {
        if (!jsonobject.has("state"))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        jsonobject = RemoteControl.RemotePlayerState.valueOf(jsonobject.getInt("state"));
        bk.a(a, jsonobject);
        bk.b(a, jsonobject);
        if (bk.y(a) != null && bk.g(a) == RemoteControl.RemotePlayerState.PLAYING && com.google.android.apps.youtube.app.remote.bk.m(a).contains(bk.y(a)))
        {
            com.google.android.apps.youtube.app.remote.bk.m(a).remove(bk.y(a));
            a.a();
        }
        a.a(bk.g(a), a.p());
        return;
        jsonobject;
        L.a("Error receiving state changed message", jsonobject);
        return;
    }

    private boolean d(JSONObject jsonobject)
    {
        if (!jsonobject.has("errors")) goto _L2; else goto _L1
_L1:
        if (jsonobject.getString("errors").length() == 0)
        {
            return false;
        }
        JSONArray jsonarray = new JSONArray(jsonobject.getString("errors"));
        int i;
        boolean flag1;
        i = 0;
        flag1 = false;
_L12:
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        Object obj;
        String s;
        obj = jsonarray.getJSONObject(i);
        s = ((JSONObject) (obj)).getString("error");
        if ("NOT_PLAYABLE".equals(s)) goto _L6; else goto _L5
_L5:
        boolean flag = flag1;
        if (!"PLAYER_ERROR".equals(s)) goto _L7; else goto _L6
_L6:
        obj = ((JSONObject) (obj)).getString("videoId");
        flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L7; else goto _L8
_L8:
        com.google.android.apps.youtube.app.remote.bk.m(a).add(obj);
        flag1 = true;
        flag = flag1;
        if (!((String) (obj)).equals(bk.A(a))) goto _L7; else goto _L9
_L9:
        bk.s(a).removeMessages(2);
        flag = flag1;
          goto _L7
_L4:
        if (!flag1) goto _L2; else goto _L10
_L10:
        a.a();
        return false;
        JSONException jsonexception;
        jsonexception;
        L.a((new StringBuilder("Invalid 'errors' value in request: ")).append(jsonobject.toString()).toString(), jsonexception);
_L2:
        return false;
_L7:
        i++;
        flag1 = flag;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void a(JSONArray jsonarray)
    {
_L2:
        return;
        if (a.b() == RemoteControl.State.OFFLINE || jsonarray.length() == 0) goto _L2; else goto _L1
_L1:
        String s3 = jsonarray.getString(0);
        if (jsonarray.length() <= 1) goto _L4; else goto _L3
_L3:
        Object obj = jsonarray.getJSONObject(1);
        jsonarray = ((JSONArray) (obj));
_L6:
        obj = Method.fromString(s3);
        if (obj == null)
        {
            L.c((new StringBuilder("Invalid method: ")).append(s3).append(". Ignoring.").toString());
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            obj = bk.A();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.b((new StringBuilder("Invalid JSON array: ")).append(jsonarray).toString(), ((Throwable) (obj)));
            return;
        }
        jsonarray = ((JSONArray) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        bk.a(a, (new StringBuilder("Received ")).append(obj).append(" : ").append(jsonarray).toString());
        switch (bn.b[((Method) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            jsonarray = a(((JSONObject) (jsonarray)));
            bk.a(a, (Set)jsonarray.get(DeviceType.REMOTE_CONTROL));
            jsonarray = (Set)jsonarray.get(DeviceType.LOUNGE_SCREEN);
            if (!jsonarray.isEmpty())
            {
                a.a(RemoteControl.State.CONNECTED);
                bk.t(a);
                jsonarray = (c)jsonarray.iterator().next();
                com.google.android.apps.youtube.app.remote.bk.d(a, ((c) (jsonarray)).g);
                com.google.android.apps.youtube.app.remote.bk.u(a).put(com.google.android.apps.youtube.app.remote.bk.c(a).getScreenId(), ((c) (jsonarray)).e);
                return;
            }
            if (!bk.v(a))
            {
                a.a(bk.w(a));
                a.a(at.b);
                return;
            }
            break;

        case 2: // '\002'
            a.a(RemoteControl.State.CONNECTED);
            bk.t(a);
            return;

        case 3: // '\003'
            a.a(bk.w(a));
            a.a(false);
            return;

        case 4: // '\004'
            jsonarray = a(((JSONObject) (jsonarray)), DeviceType.REMOTE_CONTROL);
            if (jsonarray != null)
            {
                bk.x(a).add(jsonarray);
                return;
            }
            break;

        case 5: // '\005'
            jsonarray = a(((JSONObject) (jsonarray)), DeviceType.REMOTE_CONTROL);
            if (jsonarray != null)
            {
                bk.x(a).remove(jsonarray);
                return;
            }
            break;

        case 6: // '\006'
        case 7: // '\007'
            if (jsonarray.has("video_id"))
            {
                try
                {
                    String s = jsonarray.getString("video_id");
                    if (!s.equals(bk.y(a)))
                    {
                        bk.b(a, s);
                        com.google.android.apps.youtube.app.remote.bk.c(a, s);
                        bk.a(a, 0.0D);
                        if (bk.z(a) != null && !bk.z(a).videoId.equals(bk.y(a)))
                        {
                            bk.a(a, null);
                        }
                        a.b(bk.y(a));
                        a.a(bk.y(a));
                    }
                    if (s.equals(bk.A(a)) && bk.B(a) != null && s.equals(bk.B(a).videoId))
                    {
                        a.b(bk.B(a));
                    }
                    bk.b(a, null);
                }
                catch (JSONException jsonexception)
                {
                    L.a("Error receiving now playing message", jsonexception);
                }
                b(jsonarray);
            } else
            {
                a.a(null, null);
                a.a(null);
            }
            c(jsonarray);
            return;

        case 8: // '\b'
            if (bk.A(a) == null || bk.A(a).equals(bk.y(a)))
            {
                b(jsonarray);
                c(jsonarray);
                return;
            }
            break;

        case 9: // '\t'
            if (jsonarray.has("videoIds"))
            {
                try
                {
                    String s1 = jsonarray.getString("videoIds");
                    bk.C(a).clear();
                    if (!TextUtils.isEmpty(s1))
                    {
                        Collections.addAll(bk.C(a), s1.split(","));
                    }
                    a.a(bk.C(a));
                }
                catch (JSONException jsonexception1)
                {
                    L.a("Error receiving playlist modified message", jsonexception1);
                }
            }
            if (jsonarray.has("videoId"))
            {
                try
                {
                    com.google.android.apps.youtube.app.remote.bk.c(a, jsonarray.getString("videoId"));
                    bk.b(a, bk.A(a));
                    if (bk.B(a) != null && bk.y(a).equals(bk.B(a).videoId))
                    {
                        a.b(bk.B(a));
                    }
                    if (a.b() == RemoteControl.State.CONNECTED)
                    {
                        a.a(bk.A(a));
                    }
                    bk.h(a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    L.a("Error receiving playlist modified message", jsonarray);
                }
                return;
            }
            break;

        case 10: // '\n'
            String s4 = jsonarray.optString("videoId");
            String s2 = s4;
            if (TextUtils.isEmpty(s4))
            {
                s2 = s4;
                if (!TextUtils.isEmpty(bk.y(a)))
                {
                    s2 = bk.y(a);
                }
            }
            int i = m.b(jsonarray.optString("format"), 1);
            bk.a(a, SubtitleTrack.createMdx(jsonarray.optString("languageCode"), jsonarray.optString("languageName"), jsonarray.optString("trackName"), s2, i));
            a.a(bk.z(a));
            return;

        case 11: // '\013'
            d(jsonarray);
            return;

        case 12: // '\f'
            int j = (int)m.a(jsonarray.optString("volume"), bk.D(a));
            if (bk.D(a) != j && !bk.E(a).contains(Integer.valueOf(j)))
            {
                bk.b(a, j);
                a.a(bk.D(a));
            }
            bk.E(a).remove(Integer.valueOf(j));
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
