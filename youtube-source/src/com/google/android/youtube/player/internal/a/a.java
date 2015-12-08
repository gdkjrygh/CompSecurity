// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal.a;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class a
{

    public static Map a(Locale locale)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("error_initializing_player", "An error occurred while initializing the YouTube player.");
        hashmap.put("get_youtube_app_title", "Get YouTube App");
        hashmap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
        hashmap.put("get_youtube_app_action", "Get YouTube App");
        hashmap.put("enable_youtube_app_title", "Enable YouTube App");
        hashmap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
        hashmap.put("enable_youtube_app_action", "Enable YouTube App");
        hashmap.put("update_youtube_app_title", "Update YouTube App");
        hashmap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
        hashmap.put("update_youtube_app_action", "Update YouTube App");
        a(((Map) (hashmap)), locale.getLanguage());
        a(((Map) (hashmap)), (new StringBuilder()).append(locale.getLanguage()).append("_").append(locale.getCountry()).toString());
        return hashmap;
    }

    private static void a(Map map, String s)
    {
        if ("af".equals(s))
        {
            map.put("error_initializing_player", "Kon nie die YouTube-speler inisialiseer nie.");
            map.put("get_youtube_app_title", "Kry YouTube-program");
            map.put("get_youtube_app_text", "Hierdie program sal nie loop sonder die YouTube-program, wat ontbreek van jou toestel, nie");
            map.put("get_youtube_app_action", "Kry YouTube-program");
            map.put("enable_youtube_app_title", "Aktiveer YouTube-program");
            map.put("enable_youtube_app_text", "Hierdie program sal nie werk tensy jy die YouTube-program aktiveer nie.");
            map.put("enable_youtube_app_action", "Aktiveer YouTube-program");
            map.put("update_youtube_app_title", "Dateer YouTube-program op");
            map.put("update_youtube_app_text", "Hierdie program sal nie werk tensy jy die YouTube-program opdateer nie.");
            map.put("update_youtube_app_action", "Dateer YouTube-program op");
        } else
        {
            if ("am".equals(s))
            {
                map.put("error_initializing_player", "\u12E8YouTube \u12A0\u132B\u12CB\u1279\u1295 \u1260\u121B\u1235\u1300\u1218\u122D \u120B\u12ED \u1233\u1208 \u12A0\u1295\u12F5 \u1235\u1205\u1270\u1275 \u1270\u12A8\u1235\u1277\u120D\u1362");
                map.put("get_youtube_app_title", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u130D\u1299");
                map.put("get_youtube_app_text", "\u12ED\u1205 \u1218\u1270\u130D\u1260\u122A\u12EB \u12EB\u1208 YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD \u12A0\u12ED\u1202\u12F5\u121D\u1363 \u12A5\u1231 \u12F0\u130D\u121E \u1260\u1218\u1223\u122A\u12EB\u12CE \u120B\u12ED \u12E8\u1208\u121D\u1362");
                map.put("get_youtube_app_action", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u130D\u1299");
                map.put("enable_youtube_app_title", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u1295\u1241");
                map.put("enable_youtube_app_text", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12A5\u1235\u12AB\u120B\u1290\u1241 \u12F5\u1228\u1235 \u12ED\u1205 \u1218\u1270\u130D\u1260\u122A\u12EB \u12A0\u12ED\u1230\u122B\u121D\u1362");
                map.put("enable_youtube_app_action", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u1295\u1241");
                map.put("update_youtube_app_title", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u12D8\u121D\u1291");
                map.put("update_youtube_app_text", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12A5\u1235\u12AB\u120B\u12D8\u1218\u1291\u1275 \u12F5\u1228\u1235 \u12ED\u1205 \u1218\u1270\u130D\u1260\u122A\u12EB \u12A0\u12ED\u1230\u122B\u121D\u1362");
                map.put("update_youtube_app_action", "\u12E8YouTube \u1218\u1270\u130D\u1260\u122A\u12EB\u12CD\u1295 \u12EB\u12D8\u121D\u1291");
                return;
            }
            if ("ar".equals(s))
            {
                map.put("error_initializing_player", "\u062D\u062F\u062B \u062E\u0637\u0623 \u0623\u062B\u0646\u0627\u0621 \u062A\u0647\u064A\u0626\u0629 \u0645\u0634\u063A\u0644 YouTube.");
                map.put("get_youtube_app_title", "\u0627\u0644\u062D\u0635\u0648\u0644 \u0639\u0644\u0649 \u062A\u0637\u0628\u064A\u0642 YouTube");
                map.put("get_youtube_app_text", "\u0644\u0646 \u064A\u0639\u0645\u0644 \u0647\u0630\u0627 \u0627\u0644\u062A\u0637\u0628\u064A\u0642 \u0628\u062F\u0648\u0646 \u062A\u0637\u0628\u064A\u0642 YouTube \u0627\u0644\u0630\u064A \u0644\u0627 \u064A\u062A\u0648\u0641\u0631 \u0639\u0644\u0649 \u062C\u0647\u0627\u0632\u0643");
                map.put("get_youtube_app_action", "\u0627\u0644\u062D\u0635\u0648\u0644 \u0639\u0644\u0649 \u062A\u0637\u0628\u064A\u0642 YouTube");
                map.put("enable_youtube_app_title", "\u062A\u0645\u0643\u064A\u0646 \u062A\u0637\u0628\u064A\u0642 YouTube");
                map.put("enable_youtube_app_text", "\u0644\u0646 \u064A\u0639\u0645\u0644 \u0647\u0630\u0627 \u0627\u0644\u062A\u0637\u0628\u064A\u0642 \u0645\u0627 \u0644\u0645 \u064A\u062A\u0645 \u062A\u0645\u0643\u064A\u0646 \u062A\u0637\u0628\u064A\u0642 YouTube.");
                map.put("enable_youtube_app_action", "\u062A\u0645\u0643\u064A\u0646 \u062A\u0637\u0628\u064A\u0642 YouTube");
                map.put("update_youtube_app_title", "\u062A\u062D\u062F\u064A\u062B \u062A\u0637\u0628\u064A\u0642 YouTube");
                map.put("update_youtube_app_text", "\u0644\u0646 \u064A\u0639\u0645\u0644 \u0647\u0630\u0627 \u0627\u0644\u062A\u0637\u0628\u064A\u0642 \u0645\u0627 \u0644\u0645 \u064A\u062A\u0645 \u062A\u062D\u062F\u064A\u062B \u062A\u0637\u0628\u064A\u0642 YouTube.");
                map.put("update_youtube_app_action", "\u062A\u062D\u062F\u064A\u062B \u062A\u0637\u0628\u064A\u0642 YouTube");
                return;
            }
            if ("be".equals(s))
            {
                map.put("error_initializing_player", "\u041F\u0430\u043C\u044B\u043B\u043A\u0430 \u043F\u0430\u0434\u0447\u0430\u0441 \u0456\u043D\u0456\u0446\u044B\u044F\u043B\u0456\u0437\u0430\u0446\u044B\u0456 \u043F\u0440\u0430\u0439\u0433\u0440\u0430\u0432\u0430\u043B\u044C\u043Di\u043A\u0430 YouTube.");
                map.put("get_youtube_app_title", "\u0421\u043F\u0430\u043C\u043F\u0430\u0432\u0430\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                map.put("get_youtube_app_text", "\u0413\u044D\u0442\u0430 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 \u043D\u0435 \u0431\u0443\u0434\u0437\u0435 \u043F\u0440\u0430\u0446\u0430\u0432\u0430\u0446\u044C \u0431\u0435\u0437 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u044F YouTube, \u044F\u043A\u043E\u0435 \u0430\u0434\u0441\u0443\u0442\u043D\u0456\u0447\u0430\u0435 \u043D\u0430 \u043F\u0440\u044B\u043B\u0430\u0434\u0437\u0435");
                map.put("get_youtube_app_action", "\u0421\u043F\u0430\u043C\u043F\u0430\u0432\u0430\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                map.put("enable_youtube_app_title", "\u0423\u043A\u043B\u044E\u0447\u044B\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                map.put("enable_youtube_app_text", "\u0413\u044D\u0442\u0430 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 \u043D\u0435 \u0431\u0443\u0434\u0437\u0435 \u043F\u0440\u0430\u0446\u0430\u0432\u0430\u0446\u044C, \u043F\u0430\u043A\u0443\u043B\u044C \u0432\u044B \u043D\u0435 \u045E\u043A\u043B\u044E\u0447\u044B\u0446\u0435 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube.");
                map.put("enable_youtube_app_action", "\u0423\u043A\u043B\u044E\u0447\u044B\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                map.put("update_youtube_app_title", "\u0410\u0431\u043D\u0430\u0432i\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                map.put("update_youtube_app_text", "\u0413\u044D\u0442\u0430 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 \u043D\u0435 \u0431\u0443\u0434\u0437\u0435 \u043F\u0440\u0430\u0446\u0430\u0432\u0430\u0446\u044C, \u043F\u0430\u043A\u0443\u043B\u044C \u0432\u044B \u043D\u0435 \u0430\u0431\u043D\u0430\u0432i\u0446\u0435 \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube.");
                map.put("update_youtube_app_action", "\u0410\u0431\u043D\u0430\u0432i\u0446\u044C \u043F\u0440\u044B\u043A\u043B\u0430\u0434\u0430\u043D\u043D\u0435 YouTube");
                return;
            }
            if ("bg".equals(s))
            {
                map.put("error_initializing_player", "\u041F\u0440\u0438 \u043F\u043E\u0434\u0433\u043E\u0442\u0432\u044F\u043D\u0435\u0442\u043E \u043D\u0430 \u043F\u043B\u0435\u0439\u044A\u0440\u0430 \u043D\u0430 YouTube \u0437\u0430 \u0440\u0430\u0431\u043E\u0442\u0430 \u0432\u044A\u0437\u043D\u0438\u043A\u043D\u0430 \u0433\u0440\u0435\u0448\u043A\u0430.");
                map.put("get_youtube_app_title", "\u0418\u0437\u0442\u0435\u0433\u043B. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                map.put("get_youtube_app_text", "\u0422\u043E\u0432\u0430 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 \u043D\u044F\u043C\u0430 \u0434\u0430 \u0440\u0430\u0431\u043E\u0442\u0438 \u0431\u0435\u0437 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435\u0442\u043E YouTube, \u043A\u043E\u0435\u0442\u043E \u043B\u0438\u043F\u0441\u0432\u0430 \u043D\u0430 \u0443\u0441\u0442\u0440\u043E\u0439\u0441\u0442\u0432\u043E\u0442\u043E \u0432\u0438");
                map.put("get_youtube_app_action", "\u0418\u0437\u0442\u0435\u0433\u043B. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                map.put("enable_youtube_app_title", "\u0410\u043A\u0442. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                map.put("enable_youtube_app_text", "\u0422\u043E\u0432\u0430 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 \u043D\u044F\u043C\u0430 \u0434\u0430 \u0440\u0430\u0431\u043E\u0442\u0438, \u043E\u0441\u0432\u0435\u043D \u0430\u043A\u043E \u043D\u0435 \u0430\u043A\u0442\u0438\u0432\u0438\u0440\u0430\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435\u0442\u043E YouTube.");
                map.put("enable_youtube_app_action", "\u0410\u043A\u0442. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                map.put("update_youtube_app_title", "\u0410\u043A\u0442\u0443\u043B. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                map.put("update_youtube_app_text", "\u0422\u043E\u0432\u0430 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 \u043D\u044F\u043C\u0430 \u0434\u0430 \u0440\u0430\u0431\u043E\u0442\u0438, \u043E\u0441\u0432\u0435\u043D \u0430\u043A\u043E \u043D\u0435 \u0430\u043A\u0442\u0443\u0430\u043B\u0438\u0437\u0438\u0440\u0430\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435\u0442\u043E YouTube.");
                map.put("update_youtube_app_action", "\u0410\u043A\u0442\u0443\u043B. \u043D\u0430 \u043F\u0440\u0438\u043B. YouTube");
                return;
            }
            if ("ca".equals(s))
            {
                map.put("error_initializing_player", "S'ha produ\357t un error en iniciar el reproductor de YouTube.");
                map.put("get_youtube_app_title", "Obtenci\363 aplicac. YouTube");
                map.put("get_youtube_app_text", "Aquesta aplicaci\363 no funcionar\340 sense l'aplicaci\363 de YouTube, que encara no \351s al dispositiu.");
                map.put("get_youtube_app_action", "Obt\351n l'aplic. de YouTube");
                map.put("enable_youtube_app_title", "Activaci\363 aplic. YouTube");
                map.put("enable_youtube_app_text", "Aquesta aplicaci\363 no funcionar\340 fins que no activis l'aplicaci\363 de YouTube.");
                map.put("enable_youtube_app_action", "Activa aplicaci\363 YouTube");
                map.put("update_youtube_app_title", "Actualitz. aplic. YouTube");
                map.put("update_youtube_app_text", "Aquesta aplicaci\363 no funcionar\340 fins que no actualitzis l'aplicaci\363 de YouTube.");
                map.put("update_youtube_app_action", "Actualitza aplic. YouTube");
                return;
            }
            if ("cs".equals(s))
            {
                map.put("error_initializing_player", "P\u0159i inicializaci p\u0159ehr\341va\u010De YouTube do\u0161lo k chyb\u011B.");
                map.put("get_youtube_app_title", "St\341hn\u011Bte aplikaci YouTube");
                map.put("get_youtube_app_text", "Tuto aplikaci nelze spustit bez aplikace YouTube, kterou v za\u0159\355zen\355 nem\341te nainstalovanou");
                map.put("get_youtube_app_action", "St\341hnout aplikaci YouTube");
                map.put("enable_youtube_app_title", "Aktivujte aplik. YouTube");
                map.put("enable_youtube_app_text", "Ke spu\u0161t\u011Bn\355 t\351to aplikace je t\u0159eba aktivovat aplikaci YouTube.");
                map.put("enable_youtube_app_action", "Zapnout aplikaci YouTube");
                map.put("update_youtube_app_title", "Aktualizujte apl. YouTube");
                map.put("update_youtube_app_text", "Ke spu\u0161t\u011Bn\355 t\351to aplikace je t\u0159eba aktualizovat aplikaci YouTube.");
                map.put("update_youtube_app_action", "Aktualizovat apl. YouTube");
                return;
            }
            if ("da".equals(s))
            {
                map.put("error_initializing_player", "Der opstod en fejl under initialisering af YouTube-afspilleren.");
                map.put("get_youtube_app_title", "F\345 YouTube-appen");
                map.put("get_youtube_app_text", "Denne app kan ikke k\370re uden YouTube-appen, som ikke findes p\345 din enhed");
                map.put("get_youtube_app_action", "F\345 YouTube-appen");
                map.put("enable_youtube_app_title", "Aktiv\351r YouTube-appen");
                map.put("enable_youtube_app_text", "Denne app fungerer ikke, medmindre du aktiverer YouTube-appen.");
                map.put("enable_youtube_app_action", "Aktiv\351r YouTube-appen");
                map.put("update_youtube_app_title", "Opdater YouTube-appen");
                map.put("update_youtube_app_text", "Denne app fungerer ikke, hvis du ikke opdaterer YouTube-appen.");
                map.put("update_youtube_app_action", "Opdater YouTube-appen");
                return;
            }
            if ("de".equals(s))
            {
                map.put("error_initializing_player", "Bei der Initialisierung des YouTube-Players ist ein Fehler aufgetreten.");
                map.put("get_youtube_app_title", "YouTube App herunterladen");
                map.put("get_youtube_app_text", "Diese App kann nur ausgef\374hrt werden, wenn die YouTube App bereitgestellt ist. Diese ist auf deinem Ger\344t nicht vorhanden.");
                map.put("get_youtube_app_action", "YouTube App herunterladen");
                map.put("enable_youtube_app_title", "YouTube App aktivieren");
                map.put("enable_youtube_app_text", "Diese App funktioniert nur, wenn die YouTube App aktiviert wird.");
                map.put("enable_youtube_app_action", "YouTube App aktivieren");
                map.put("update_youtube_app_title", "YouTube App aktualisieren");
                map.put("update_youtube_app_text", "Diese App funktioniert nur, wenn die YouTube App aktualisiert wird.");
                map.put("update_youtube_app_action", "YouTube App aktualisieren");
                return;
            }
            if ("el".equals(s))
            {
                map.put("error_initializing_player", "\u03A0\u03B1\u03C1\u03BF\u03C5\u03C3\u03B9\u03AC\u03C3\u03C4\u03B7\u03BA\u03B5 \u03C3\u03C6\u03AC\u03BB\u03BC\u03B1 \u03BA\u03B1\u03C4\u03AC \u03C4\u03B7\u03BD \u03C0\u03C1\u03BF\u03B5\u03C4\u03BF\u03B9\u03BC\u03B1\u03C3\u03AF\u03B1 \u03C4\u03BF\u03C5 \u03C0\u03C1\u03BF\u03B3\u03C1\u03AC\u03BC\u03BC\u03B1\u03C4\u03BF\u03C2 \u03B1\u03BD\u03B1\u03C0\u03B1\u03C1\u03B1\u03B3\u03C9\u03B3\u03AE\u03C2 \u03C4\u03BF\u03C5 YouTube.");
                map.put("get_youtube_app_title", "\u039B\u03AE\u03C8\u03B7 YouTube");
                map.put("get_youtube_app_text", "\u0394\u03B5\u03BD \u03B5\u03AF\u03BD\u03B1\u03B9 \u03B4\u03C5\u03BD\u03B1\u03C4\u03AE \u03B7 \u03B5\u03BA\u03C4\u03AD\u03BB\u03B5\u03C3\u03B7 \u03B1\u03C5\u03C4\u03AE\u03C2 \u03C4\u03B7\u03C2 \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE\u03C2 \u03C7\u03C9\u03C1\u03AF\u03C2 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE YouTube, \u03B7 \u03BF\u03C0\u03BF\u03AF\u03B1 \u03B1\u03C0\u03BF\u03C5\u03C3\u03B9\u03AC\u03B6\u03B5\u03B9 \u03B1\u03C0\u03CC \u03C4\u03B7 \u03C3\u03C5\u03C3\u03BA\u03B5\u03C5\u03AE \u03C3\u03B1\u03C2");
                map.put("get_youtube_app_action", "\u039B\u03AE\u03C8\u03B7 YouTube");
                map.put("enable_youtube_app_title", "\u0395\u03BD\u03B5\u03C1\u03B3\u03BF\u03C0\u03BF\u03AF\u03B7\u03C3\u03B7 YouTube");
                map.put("enable_youtube_app_text", "\u0394\u03B5\u03BD \u03B5\u03AF\u03BD\u03B1\u03B9 \u03B4\u03C5\u03BD\u03B1\u03C4\u03AE \u03B7 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u03B1\u03C5\u03C4\u03AE\u03C2 \u03C4\u03B7\u03C2 \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE\u03C2 \u03B5\u03AC\u03BD \u03B4\u03B5\u03BD \u03B5\u03BD\u03B5\u03C1\u03B3\u03BF\u03C0\u03BF\u03B9\u03AE\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE YouTube.");
                map.put("enable_youtube_app_action", "\u0395\u03BD\u03B5\u03C1\u03B3\u03BF\u03C0\u03BF\u03AF\u03B7\u03C3\u03B7 YouTube");
                map.put("update_youtube_app_title", "\u0395\u03BD\u03B7\u03BC\u03AD\u03C1\u03C9\u03C3\u03B7 YouTube");
                map.put("update_youtube_app_text", "\u0394\u03B5\u03BD \u03B5\u03AF\u03BD\u03B1\u03B9 \u03B4\u03C5\u03BD\u03B1\u03C4\u03AE \u03B7 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u03B1\u03C5\u03C4\u03AE\u03C2 \u03C4\u03B7\u03C2 \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE\u03C2 \u03B5\u03AC\u03BD \u03B4\u03B5\u03BD \u03B5\u03BD\u03B7\u03BC\u03B5\u03C1\u03CE\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE YouTube.");
                map.put("update_youtube_app_action", "\u0395\u03BD\u03B7\u03BC\u03AD\u03C1\u03C9\u03C3\u03B7 YouTube");
                return;
            }
            if ("en_GB".equals(s))
            {
                map.put("error_initializing_player", "An error occurred while initialising the YouTube player.");
                map.put("get_youtube_app_title", "Get YouTube App");
                map.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
                map.put("get_youtube_app_action", "Get YouTube App");
                map.put("enable_youtube_app_title", "Enable YouTube App");
                map.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
                map.put("enable_youtube_app_action", "Enable YouTube App");
                map.put("update_youtube_app_title", "Update YouTube App");
                map.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
                map.put("update_youtube_app_action", "Update YouTube App");
                return;
            }
            if ("es_US".equals(s))
            {
                map.put("error_initializing_player", "Se produjo un error al iniciar el reproductor de YouTube.");
                map.put("get_youtube_app_title", "Obtener YouTube");
                map.put("get_youtube_app_text", "Esta aplicaci\363n no se ejecutar\341 sin la aplicaci\363n YouTube, la cual no se instal\363 en tu dispositivo.");
                map.put("get_youtube_app_action", "Obtener YouTube");
                map.put("enable_youtube_app_title", "Activar YouTube");
                map.put("enable_youtube_app_text", "Esta aplicaci\363n no funcionar\341 a menos que actives la aplicaci\363n YouTube.");
                map.put("enable_youtube_app_action", "Activar YouTube");
                map.put("update_youtube_app_title", "Actualizar YouTube");
                map.put("update_youtube_app_text", "Esta aplicaci\363n no funcionar\341 a menos que actualices la aplicaci\363n YouTube.");
                map.put("update_youtube_app_action", "Actualizar YouTube");
                return;
            }
            if ("es".equals(s))
            {
                map.put("error_initializing_player", "Se ha producido un error al iniciar el reproductor de YouTube.");
                map.put("get_youtube_app_title", "Descarga YouTube");
                map.put("get_youtube_app_text", "Esta aplicaci\363n no funcionar\341 sin la aplicaci\363n YouTube, que no est\341 instalada en el dispositivo.");
                map.put("get_youtube_app_action", "Descargar YouTube");
                map.put("enable_youtube_app_title", "Habilita la aplicaci\363n YouTube");
                map.put("enable_youtube_app_text", "Esta aplicaci\363n no funcionar\341 si no habilitas la aplicaci\363n YouTube.");
                map.put("enable_youtube_app_action", "Habilitar YouTube");
                map.put("update_youtube_app_title", "Actualiza YouTube");
                map.put("update_youtube_app_text", "Esta aplicaci\363n no funcionar\341 si no actualizas la aplicaci\363n YouTube.");
                map.put("update_youtube_app_action", "Actualizar YouTube");
                return;
            }
            if ("et".equals(s))
            {
                map.put("error_initializing_player", "YouTube'i m\344ngija l\344htestamisel tekkis viga.");
                map.put("get_youtube_app_title", "YouTube'i rak. hankimine");
                map.put("get_youtube_app_text", "Rakendus ei k\344ivitu ilma YouTube'i rakenduseta ja teie seadmes see praegu puudub");
                map.put("get_youtube_app_action", "Hangi YouTube'i rakendus");
                map.put("enable_youtube_app_title", "YouTube'i rakenduse lubamine");
                map.put("enable_youtube_app_text", "Rakendus ei toimi, kui te ei luba kasutada YouTube'i rakendust.");
                map.put("enable_youtube_app_action", "Luba YouTube'i rakendus");
                map.put("update_youtube_app_title", "V\344rskenda YouTube");
                map.put("update_youtube_app_text", "Rakendus ei toimi enne, kui olete YouTube'i rakendust v\344rskendanud.");
                map.put("update_youtube_app_action", "V\344rsk. YouTube'i rakend.");
                return;
            }
            if ("fa".equals(s))
            {
                map.put("error_initializing_player", "\u0647\u0646\u06AF\u0627\u0645 \u0645\u0642\u062F\u0627\u0631\u062F\u0647\u06CC \u0627\u0648\u0644\u06CC\u0647 \u067E\u062E\u0634\u200C\u06A9\u0646\u0646\u062F\u0647 YouTube\u060C \u062E\u0637\u0627\u06CC\u06CC \u0631\u0648\u06CC \u062F\u0627\u062F.");
                map.put("get_youtube_app_title", "\u062F\u0631\u06CC\u0627\u0641\u062A \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                map.put("get_youtube_app_text", "\u0627\u06CC\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 \u0628\u062F\u0648\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 YouTube \u06A9\u0647 \u062F\u0631 \u062F\u0633\u062A\u06AF\u0627\u0647 \u0634\u0645\u0627 \u0645\u0648\u062C\u0648\u062F \u0646\u06CC\u0633\u062A\u060C \u0627\u062C\u0631\u0627 \u0646\u0645\u06CC\u200C\u0634\u0648\u062F");
                map.put("get_youtube_app_action", "\u062F\u0631\u06CC\u0627\u0641\u062A \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                map.put("enable_youtube_app_title", "\u0641\u0639\u0627\u0644 \u06A9\u0631\u062F\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                map.put("enable_youtube_app_text", "\u0627\u06CC\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 \u062A\u0646\u0647\u0627 \u062F\u0631 \u0635\u0648\u0631\u062A\u06CC \u06A9\u0627\u0631 \u062E\u0648\u0627\u0647\u062F \u06A9\u0631\u062F \u06A9\u0647 \u0628\u0631\u0646\u0627\u0645\u0647 YouTube \u0631\u0627 \u0641\u0639\u0627\u0644 \u06A9\u0646\u06CC\u062F.");
                map.put("enable_youtube_app_action", "\u0641\u0639\u0627\u0644 \u06A9\u0631\u062F\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                map.put("update_youtube_app_title", "\u0628\u0647\u200C\u0631\u0648\u0632\u0631\u0633\u0627\u0646\u06CC \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                map.put("update_youtube_app_text", "\u0627\u06CC\u0646 \u0628\u0631\u0646\u0627\u0645\u0647 \u06A9\u0627\u0631 \u0646\u062E\u0648\u0627\u0647\u062F \u06A9\u0631\u062F \u0645\u06AF\u0631 \u0627\u06CC\u0646\u06A9\u0647 \u0628\u0631\u0646\u0627\u0645\u0647 YouTube \u0631\u0627 \u0628\u0647 \u0631\u0648\u0632 \u06A9\u0646\u06CC\u062F.");
                map.put("update_youtube_app_action", "\u0628\u0647\u200C\u0631\u0648\u0632\u0631\u0633\u0627\u0646\u06CC \u0628\u0631\u0646\u0627\u0645\u0647 YouTube");
                return;
            }
            if ("fi".equals(s))
            {
                map.put("error_initializing_player", "Virhe alustettaessa YouTube-soitinta.");
                map.put("get_youtube_app_title", "Hanki YouTube-sovellus");
                map.put("get_youtube_app_text", "T\344m\344 sovellus ei toimi ilman YouTube-sovellusta, joka puuttuu laitteesta.");
                map.put("get_youtube_app_action", "Hanki YouTube-sovellus");
                map.put("enable_youtube_app_title", "Ota YouTube-sov. k\344ytt\366\366n");
                map.put("enable_youtube_app_text", "T\344m\344 sovellus ei toimi, ellet ota YouTube-sovellusta k\344ytt\366\366n.");
                map.put("enable_youtube_app_action", "Ota YouTube-sov. k\344ytt\366\366n");
                map.put("update_youtube_app_title", "P\344ivit\344 YouTube-sovellus");
                map.put("update_youtube_app_text", "T\344m\344 sovellus ei toimi, ellet p\344ivit\344 YouTube-sovellusta.");
                map.put("update_youtube_app_action", "P\344ivit\344 YouTube-sovellus");
                return;
            }
            if ("fr".equals(s))
            {
                map.put("error_initializing_player", "Une erreur s'est produite lors de l'initialisation du lecteur YouTube.");
                map.put("get_youtube_app_title", "T\351l\351charger appli YouTube");
                map.put("get_youtube_app_text", "Cette application ne fonctionnera pas sans l'application YouTube, qui n'est pas install\351e sur votre appareil.");
                map.put("get_youtube_app_action", "T\351l\351charger appli YouTube");
                map.put("enable_youtube_app_title", "Activer l'appli YouTube");
                map.put("enable_youtube_app_text", "Cette application ne fonctionnera que si vous activez l'application YouTube.");
                map.put("enable_youtube_app_action", "Activer l'appli YouTube");
                map.put("update_youtube_app_title", "Mise \340 jour appli YouTube");
                map.put("update_youtube_app_text", "Cette application ne fonctionnera que si vous mettez \340 jour l'application YouTube.");
                map.put("update_youtube_app_action", "Mise \340 jour appli YouTube");
                return;
            }
            if ("hi".equals(s))
            {
                map.put("error_initializing_player", "YouTube \u092A\u094D\u0932\u0947\u092F\u0930 \u0915\u094B \u092A\u094D\u0930\u093E\u0930\u0902\u092D \u0915\u0930\u0924\u0947 \u0938\u092E\u092F \u0915\u094B\u0908 \u0924\u094D\u0930\u0941\u091F\u093F \u0906\u0908.");
                map.put("get_youtube_app_title", "YouTube \u090F\u092A\u094D\u0932\u093F. \u092A\u094D\u0930\u093E\u092A\u094D\u0924 \u0915\u0930\u0947\u0902");
                map.put("get_youtube_app_text", "\u092F\u0939 \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 YouTube \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 \u0915\u0947 \u092C\u093F\u0928\u093E \u0928\u0939\u0940\u0902 \u091A\u0932\u0947\u0917\u093E, \u091C\u094B \u0906\u092A\u0915\u0947 \u0909\u092A\u0915\u0930\u0923 \u092A\u0930 \u092E\u094C\u091C\u0942\u0926 \u0928\u0939\u0940\u0902 \u0939\u0948");
                map.put("get_youtube_app_action", "YouTube \u090F\u092A\u094D\u0932\u093F. \u092A\u094D\u0930\u093E\u092A\u094D\u0924 \u0915\u0930\u0947\u0902");
                map.put("enable_youtube_app_title", "YouTube \u090F\u092A\u094D\u0932\u093F. \u0938\u0915\u094D\u0937\u092E \u0915\u0930\u0947\u0902");
                map.put("enable_youtube_app_text", "\u091C\u092C \u0924\u0915 \u0906\u092A YouTube \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 \u0938\u0915\u094D\u0937\u092E \u0928\u0939\u0940\u0902 \u0915\u0930\u0924\u0947, \u0924\u092C \u0924\u0915 \u092F\u0939 \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 \u0915\u093E\u0930\u094D\u092F \u0928\u0939\u0940\u0902 \u0915\u0930\u0947\u0917\u093E.");
                map.put("enable_youtube_app_action", "YouTube \u090F\u092A\u094D\u0932\u093F. \u0938\u0915\u094D\u0937\u092E \u0915\u0930\u0947\u0902");
                map.put("update_youtube_app_title", "YouTube \u090F\u092A\u094D\u0932\u093F. \u0905\u092A\u0921\u0947\u091F \u0915\u0930\u0947\u0902");
                map.put("update_youtube_app_text", "\u091C\u092C \u0924\u0915 \u0906\u092A YouTube \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 \u0905\u092A\u0921\u0947\u091F \u0928\u0939\u0940\u0902 \u0915\u0930\u0924\u0947, \u0924\u092C \u0924\u0915 \u092F\u0939 \u090F\u092A\u094D\u0932\u093F\u0915\u0947\u0936\u0928 \u0915\u093E\u0930\u094D\u092F \u0928\u0939\u0940\u0902 \u0915\u0930\u0947\u0917\u093E.");
                map.put("update_youtube_app_action", "YouTube \u090F\u092A\u094D\u0932\u093F. \u0905\u092A\u0921\u0947\u091F \u0915\u0930\u0947\u0902");
                return;
            }
            if ("hr".equals(s))
            {
                map.put("error_initializing_player", "Dogodila se pogre\u0161ka tijekom pokretanja playera usluge YouTube.");
                map.put("get_youtube_app_title", "Preuzimanje apl. YouTube");
                map.put("get_youtube_app_text", "Ova se aplikacija ne mo\u017Ee pokrenuti bez aplikacije YouTube, koja nije instalirana na va\u0161 ure\u0111aj");
                map.put("get_youtube_app_action", "Preuzmi apl. YouTube");
                map.put("enable_youtube_app_title", "Omogu\u0107avanje apl. YouTube");
                map.put("enable_youtube_app_text", "Ova aplikacija ne\u0107e funkcionirati ako ne omogu\u0107ite aplikaciju YouTube.");
                map.put("enable_youtube_app_action", "Omogu\u0107i apl. YouTube");
                map.put("update_youtube_app_title", "A\u017Euriranje apl. YouTube");
                map.put("update_youtube_app_text", "Ova aplikacija ne\u0107e funkcionirati ako ne a\u017Eurirate aplikaciju YouTube.");
                map.put("update_youtube_app_action", "A\u017Euriraj apl. YouTube");
                return;
            }
            if ("hu".equals(s))
            {
                map.put("error_initializing_player", "Hiba t\366rt\351nt a YouTube lej\341tsz\363 inicializ\341l\341sa sor\341n.");
                map.put("get_youtube_app_title", "YouTube alk. let\366lt\351se");
                map.put("get_youtube_app_text", "Ez az alkalmaz\341s nem fut a YouTube alkalmaz\341s n\351lk\374l, amely hi\341nyzik az eszk\366z\351r\u0151l.");
                map.put("get_youtube_app_action", "YouTube alk. let\366lt\351se");
                map.put("enable_youtube_app_title", "YouTube alkalmaz\341s enged.");
                map.put("enable_youtube_app_text", "Az alkalmaz\341s csak akkor fog m\u0171k\366dni, ha enged\351lyezi a YouTube alkalmaz\341st.");
                map.put("enable_youtube_app_action", "YouTube alkalmaz\341s enged.");
                map.put("update_youtube_app_title", "YouTube alk. friss\355t\351se");
                map.put("update_youtube_app_text", "Az alkalmaz\341s csak akkor fog m\u0171k\366dni, ha friss\355ti a YouTube alkalmaz\341st.");
                map.put("update_youtube_app_action", "YouTube alk. friss\355t\351se");
                return;
            }
            if ("in".equals(s))
            {
                map.put("error_initializing_player", "Terjadi kesalahan saat memulai pemutar YouTube.");
                map.put("get_youtube_app_title", "Dapatkan Aplikasi YouTube");
                map.put("get_youtube_app_text", "Aplikasi ini tidak akan berjalan tanpa Aplikasi YouTube, yang hilang dari perangkat Anda");
                map.put("get_youtube_app_action", "Dapatkan Aplikasi YouTube");
                map.put("enable_youtube_app_title", "Aktifkan Aplikasi YouTube");
                map.put("enable_youtube_app_text", "Aplikasi ini tidak akan bekerja kecuali Anda mengaktifkan Aplikasi YouTube.");
                map.put("enable_youtube_app_action", "Aktifkan Aplikasi YouTube");
                map.put("update_youtube_app_title", "Perbarui Aplikasi YouTube");
                map.put("update_youtube_app_text", "Aplikasi ini tidak akan bekerja kecuali Anda memperbarui Aplikasi YouTube.");
                map.put("update_youtube_app_action", "Perbarui Aplikasi YouTube");
                return;
            }
            if ("it".equals(s))
            {
                map.put("error_initializing_player", "Si \350 verificato un errore durante l'inizializzazione del player di YouTube.");
                map.put("get_youtube_app_title", "Scarica app YouTube");
                map.put("get_youtube_app_text", "Questa applicazione non funzioner\340 senza l'applicazione YouTube che non \350 presente sul tuo dispositivo");
                map.put("get_youtube_app_action", "Scarica app YouTube");
                map.put("enable_youtube_app_title", "Attiva app YouTube");
                map.put("enable_youtube_app_text", "Questa applicazione non funzioner\340 se non attivi l'applicazione YouTube.");
                map.put("enable_youtube_app_action", "Attiva app YouTube");
                map.put("update_youtube_app_title", "Aggiorna app YouTube");
                map.put("update_youtube_app_text", "Questa applicazione non funzioner\340 se non aggiorni l'applicazione YouTube.");
                map.put("update_youtube_app_action", "Aggiorna app YouTube");
                return;
            }
            if ("iw".equals(s))
            {
                map.put("error_initializing_player", "\u05D0\u05D9\u05E8\u05E2\u05D4 \u05E9\u05D2\u05D9\u05D0\u05D4 \u05D1\u05E2\u05EA \u05D0\u05EA\u05D7\u05D5\u05DC \u05E0\u05D2\u05DF YouTube.");
                map.put("get_youtube_app_title", "\u05E7\u05D1\u05DC \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                map.put("get_youtube_app_text", "\u05D9\u05D9\u05E9\u05D5\u05DD \u05D6\u05D4 \u05DC\u05D0 \u05D9\u05E4\u05E2\u05DC \u05DC\u05DC\u05D0 \u05D9\u05D9\u05E9\u05D5\u05DD YouTube, \u05E9\u05D0\u05D9\u05E0\u05D5 \u05DE\u05D5\u05EA\u05E7\u05DF \u05D1\u05DE\u05DB\u05E9\u05D9\u05E8 \u05E9\u05DC\u05DA");
                map.put("get_youtube_app_action", "\u05E7\u05D1\u05DC \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                map.put("enable_youtube_app_title", "\u05D4\u05E4\u05E2\u05DC \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                map.put("enable_youtube_app_text", "\u05D9\u05D9\u05E9\u05D5\u05DD \u05D6\u05D4 \u05DC\u05D0 \u05D9\u05E2\u05D1\u05D5\u05D3 \u05D0\u05DC\u05D0 \u05D0\u05DD \u05EA\u05E4\u05E2\u05D9\u05DC \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube.");
                map.put("enable_youtube_app_action", "\u05D4\u05E4\u05E2\u05DC \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                map.put("update_youtube_app_title", "\u05E2\u05D3\u05DB\u05DF \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                map.put("update_youtube_app_text", "\u05D9\u05D9\u05E9\u05D5\u05DD \u05D6\u05D4 \u05DC\u05D0 \u05D9\u05E2\u05D1\u05D5\u05D3 \u05D0\u05DC\u05D0 \u05D0\u05DD \u05EA\u05E2\u05D3\u05DB\u05DF \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube.");
                map.put("update_youtube_app_action", "\u05E2\u05D3\u05DB\u05DF \u05D0\u05EA \u05D9\u05D9\u05E9\u05D5\u05DD YouTube");
                return;
            }
            if ("ja".equals(s))
            {
                map.put("error_initializing_player", "YouTube\u30D7\u30EC\u30FC\u30E4\u30FC\u306E\u521D\u671F\u5316\u4E2D\u306B\u30A8\u30E9\u30FC\u304C\u767A\u751F\u3057\u307E\u3057\u305F\u3002");
                map.put("get_youtube_app_title", "YouTube\u30A2\u30D7\u30EA\u3092\u5165\u624B");
                map.put("get_youtube_app_text", "\u3053\u306E\u30A2\u30D7\u30EA\u306E\u5B9F\u884C\u306B\u5FC5\u8981\u306AYouTube\u30A2\u30D7\u30EA\u304C\u7AEF\u672B\u306B\u3042\u308A\u307E\u305B\u3093");
                map.put("get_youtube_app_action", "YouTube\u30A2\u30D7\u30EA\u3092\u5165\u624B");
                map.put("enable_youtube_app_title", "YouTube\u30A2\u30D7\u30EA\u3092\u6709\u52B9\u5316");
                map.put("enable_youtube_app_text", "\u3053\u306E\u30A2\u30D7\u30EA\u306E\u5B9F\u884C\u306B\u306FYouTube\u30A2\u30D7\u30EA\u306E\u6709\u52B9\u5316\u304C\u5FC5\u8981\u3067\u3059\u3002");
                map.put("enable_youtube_app_action", "YouTube\u30A2\u30D7\u30EA\u3092\u6709\u52B9\u5316");
                map.put("update_youtube_app_title", "YouTube\u30A2\u30D7\u30EA\u3092\u66F4\u65B0");
                map.put("update_youtube_app_text", "\u3053\u306E\u30A2\u30D7\u30EA\u306E\u5B9F\u884C\u306B\u306FYouTube\u30A2\u30D7\u30EA\u306E\u66F4\u65B0\u304C\u5FC5\u8981\u3067\u3059\u3002");
                map.put("update_youtube_app_action", "YouTube\u30A2\u30D7\u30EA\u3092\u66F4\u65B0");
                return;
            }
            if ("ko".equals(s))
            {
                map.put("error_initializing_player", "YouTube \uD50C\uB808\uC774\uC5B4\uB97C \uCD08\uAE30\uD654\uD558\uB294 \uC911\uC5D0 \uC624\uB958\uAC00 \uBC1C\uC0DD\uD588\uC2B5\uB2C8\uB2E4.");
                map.put("get_youtube_app_title", "YouTube \uC571 \uB2E4\uC6B4\uB85C\uB4DC");
                map.put("get_youtube_app_text", "\uC774 \uC571\uC740 \uB0B4 \uAE30\uAE30\uC5D0 YouTube \uC571\uC774 \uC5C6\uC5B4\uC11C \uC2E4\uD589\uB418\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
                map.put("get_youtube_app_action", "YouTube \uC571 \uB2E4\uC6B4\uB85C\uB4DC");
                map.put("enable_youtube_app_title", "YouTube \uC571 \uC0AC\uC6A9 \uC124\uC815");
                map.put("enable_youtube_app_text", "\uC774 \uC571\uC740 YouTube \uC571\uC744 \uC0AC\uC6A9\uD558\uB3C4\uB85D \uC124\uC815\uD558\uC9C0 \uC54A\uC73C\uBA74 \uC791\uB3D9\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
                map.put("enable_youtube_app_action", "YouTube \uC571 \uC0AC\uC6A9");
                map.put("update_youtube_app_title", "YouTube \uC571 \uC5C5\uB370\uC774\uD2B8");
                map.put("update_youtube_app_text", "\uC774 \uC571\uC740 YouTube \uC571\uC744 \uC5C5\uB370\uC774\uD2B8\uD558\uC9C0 \uC54A\uC73C\uBA74 \uC791\uB3D9\uD558\uC9C0 \uC54A\uC2B5\uB2C8\uB2E4.");
                map.put("update_youtube_app_action", "YouTube \uC571 \uC5C5\uB370\uC774\uD2B8");
                return;
            }
            if ("lt".equals(s))
            {
                map.put("error_initializing_player", "Inicijuojant \u201EYouTube\u201C grotuv\u0105 \u012Fvyko klaida.");
                map.put("get_youtube_app_title", "Gauti \u201EYouTube\u201C program\u0105");
                map.put("get_youtube_app_text", "\u0160i programa neveikia be \u201EYouTube\u201C programos, o jos \u012Frenginyje n\u0117ra.");
                map.put("get_youtube_app_action", "Gauti \u201EYouTube\u201C program\u0105");
                map.put("enable_youtube_app_title", "\u012Egalinti \u201EYouTube\u201C progr.");
                map.put("enable_youtube_app_text", "\u0160i programa neveiks, jei ne\u012Fgalinsite \u201EYouTube\u201C programos.");
                map.put("enable_youtube_app_action", "\u012Egalinti \u201EYouTube\u201C progr.");
                map.put("update_youtube_app_title", "Atnauj. \u201EYouTube\u201C progr.");
                map.put("update_youtube_app_text", "\u0160i programa neveiks, jei neatnaujinsite \u201EYouTube\u201C programos.");
                map.put("update_youtube_app_action", "Atnauj. \u201EYouTube\u201C progr.");
                return;
            }
            if ("lv".equals(s))
            {
                map.put("error_initializing_player", "Inicializ\u0113jot YouTube atska\u0146ot\u0101ju, rad\u0101s k\u013C\u016Bda.");
                map.put("get_youtube_app_title", "YouTube liet. ieg\u016B\u0161ana");
                map.put("get_youtube_app_text", "\u0160\u012B lietotne nedarbosies bez YouTube lietotnes, kuras nav \u0161aj\u0101 ier\u012Bc\u0113.");
                map.put("get_youtube_app_action", "Ieg\u016Bt YouTube lietotni");
                map.put("enable_youtube_app_title", "YouTube liet. iesp\u0113jo\u0161ana");
                map.put("enable_youtube_app_text", "Lai \u0161\u012B lietotne darbotos, iesp\u0113jojiet YouTube lietotni.");
                map.put("enable_youtube_app_action", "Iesp\u0113jot YouTube lietotni");
                map.put("update_youtube_app_title", "YouTube liet. atjaunin.");
                map.put("update_youtube_app_text", "Lai \u0161\u012B lietotne darbotos, atjauniniet YouTube lietotni.");
                map.put("update_youtube_app_action", "Atjaun. YouTube lietotni");
                return;
            }
            if ("ms".equals(s))
            {
                map.put("error_initializing_player", "Ralat berlaku semasa memulakan alat main YouTube.");
                map.put("get_youtube_app_title", "Dapatkan Apl YouTube");
                map.put("get_youtube_app_text", "Apl ini tidak akan berjalan tanpa Apl YouTube, yang tidak ada pada peranti anda");
                map.put("get_youtube_app_action", "Dapatkan Apl YouTube");
                map.put("enable_youtube_app_title", "Dayakan Apl YouTube");
                map.put("enable_youtube_app_text", "Apl ini tidak akan berfungsi kecuali anda mendayakan Apl YouTube.");
                map.put("enable_youtube_app_action", "Dayakan Apl YouTube");
                map.put("update_youtube_app_title", "Kemas kini Apl YouTube");
                map.put("update_youtube_app_text", "Apl ini tidak akan berfungsi kecuali anda mengemas kini Apl YouTube.");
                map.put("update_youtube_app_action", "Kemas kini Apl YouTube");
                return;
            }
            if ("nb".equals(s))
            {
                map.put("error_initializing_player", "Det oppsto en feil da YouTube-avspilleren startet.");
                map.put("get_youtube_app_title", "Skaff deg YouTube-appen");
                map.put("get_youtube_app_text", "Denne appen kan ikke kj\370re uten YouTube-appen, som du ikke har p\345 enheten");
                map.put("get_youtube_app_action", "Skaff deg YouTube-appen");
                map.put("enable_youtube_app_title", "Aktiver YouTube-appen");
                map.put("enable_youtube_app_text", "Denne appen fungerer ikke f\370r du aktiverer YouTube-appen.");
                map.put("enable_youtube_app_action", "Aktiver YouTube-appen");
                map.put("update_youtube_app_title", "Oppdater YouTube-appen");
                map.put("update_youtube_app_text", "Denne appen fungerer ikke f\370r du oppdaterer YouTube-appen.");
                map.put("update_youtube_app_action", "Oppdater YouTube-appen");
                return;
            }
            if ("nl".equals(s))
            {
                map.put("error_initializing_player", "Er is een fout opgetreden bij het initialiseren van de YouTube-speler.");
                map.put("get_youtube_app_title", "YouTube-app downloaden");
                map.put("get_youtube_app_text", "Deze app wordt niet uitgevoerd zonder de YouTube-app, die op uw apparaat ontbreekt");
                map.put("get_youtube_app_action", "YouTube-app downloaden");
                map.put("enable_youtube_app_title", "YouTube-app inschakelen");
                map.put("enable_youtube_app_text", "Deze app werkt niet, tenzij u de YouTube-app inschakelt.");
                map.put("enable_youtube_app_action", "YouTube-app inschakelen");
                map.put("update_youtube_app_title", "YouTube-app bijwerken");
                map.put("update_youtube_app_text", "Deze app werkt niet, tenzij u de YouTube-app bijwerkt.");
                map.put("update_youtube_app_action", "YouTube-app bijwerken");
                return;
            }
            if ("pl".equals(s))
            {
                map.put("error_initializing_player", "Podczas inicjowania odtwarzacza YouTube wyst\u0105pi\u0142 b\u0142\u0105d.");
                map.put("get_youtube_app_title", "Pobierz aplikacj\u0119 YouTube");
                map.put("get_youtube_app_text", "Ta aplikacja nie b\u0119dzie dzia\u0142a\u0107 bez aplikacji YouTube, kt\363rej nie ma na tym urz\u0105dzeniu");
                map.put("get_youtube_app_action", "Pobierz aplikacj\u0119 YouTube");
                map.put("enable_youtube_app_title", "W\u0142\u0105cz aplikacj\u0119 YouTube");
                map.put("enable_youtube_app_text", "Ta aplikacja nie b\u0119dzie dzia\u0142a\u0107, je\u015Bli nie w\u0142\u0105czysz aplikacji YouTube.");
                map.put("enable_youtube_app_action", "W\u0142\u0105cz aplikacj\u0119 YouTube");
                map.put("update_youtube_app_title", "Zaktualizuj aplikacj\u0119 YouTube");
                map.put("update_youtube_app_text", "Ta aplikacja nie b\u0119dzie dzia\u0142a\u0107, je\u015Bli nie zaktualizujesz aplikacji YouTube.");
                map.put("update_youtube_app_action", "Zaktualizuj aplikacj\u0119 YouTube");
                return;
            }
            if ("pt_PT".equals(s))
            {
                map.put("error_initializing_player", "Ocorreu um erro ao iniciar o leitor do YouTube.");
                map.put("get_youtube_app_title", "Obter a Aplica\347\343o YouTube");
                map.put("get_youtube_app_text", "Esta aplica\347\343o n\343o ser\341 executada sem a Aplica\347\343o YouTube, que est\341 em falta no seu dispositivo");
                map.put("get_youtube_app_action", "Obter a Aplica\347\343o YouTube");
                map.put("enable_youtube_app_title", "Ativar Aplica\347\343o YouTube");
                map.put("enable_youtube_app_text", "Esta aplica\347\343o n\343o ir\341 funcionar enquanto n\343o ativar a Aplica\347\343o YouTube.");
                map.put("enable_youtube_app_action", "Ativar Aplica\347\343o YouTube");
                map.put("update_youtube_app_title", "Atualizar Aplica. YouTube");
                map.put("update_youtube_app_text", "Esta aplica\347\343o n\343o ir\341 funcionar enquanto n\343o atualizar a Aplica\347\343o YouTube.");
                map.put("update_youtube_app_action", "Atualizar Aplica. YouTube");
                return;
            }
            if ("pt".equals(s))
            {
                map.put("error_initializing_player", "Ocorreu um erro ao inicializar o player do YouTube.");
                map.put("get_youtube_app_title", "Obter aplicativo YouTube");
                map.put("get_youtube_app_text", "Este aplicativo s\363 funciona com o aplicativo YouTube, que est\341 ausente no dispositivo.");
                map.put("get_youtube_app_action", "Obter aplicativo YouTube");
                map.put("enable_youtube_app_title", "Ativar aplicativo YouTube");
                map.put("enable_youtube_app_text", "Este aplicativo s\363 funciona com o aplicativo YouTube ativado.");
                map.put("enable_youtube_app_action", "Ativar aplicativo YouTube");
                map.put("update_youtube_app_title", "Atualizar aplic. YouTube");
                map.put("update_youtube_app_text", "Este aplicativo s\363 funciona com o aplicativo YouTube atualizado.");
                map.put("update_youtube_app_action", "Atualizar aplic. YouTube");
                return;
            }
            if ("ro".equals(s))
            {
                map.put("error_initializing_player", "A ap\u0103rut o eroare la ini\u0163ializarea playerului YouTube.");
                map.put("get_youtube_app_title", "Desc\u0103rca\u0163i YouTube");
                map.put("get_youtube_app_text", "Aceast\u0103 aplica\u0163ie nu va rula f\u0103r\u0103 aplica\u0163ia YouTube, care lipse\u015Fte de pe gadget");
                map.put("get_youtube_app_action", "Desc\u0103rca\u0163i YouTube");
                map.put("enable_youtube_app_title", "Activa\u0163i YouTube");
                map.put("enable_youtube_app_text", "Aceast\u0103 aplica\u0163ie nu va func\u0163iona dec\342t dac\u0103 activa\u0163i aplica\u0163ia YouTube.");
                map.put("enable_youtube_app_action", "Activa\u0163i YouTube");
                map.put("update_youtube_app_title", "Actualiza\u0163i YouTube");
                map.put("update_youtube_app_text", "Aceast\u0103 aplica\u0163ie nu va func\u0163iona dec\342t dac\u0103 actualiza\u0163i aplica\u0163ia YouTube.");
                map.put("update_youtube_app_action", "Actualiza\u0163i YouTube");
                return;
            }
            if ("ru".equals(s))
            {
                map.put("error_initializing_player", "\u041D\u0435 \u0443\u0434\u0430\u043B\u043E\u0441\u044C \u0437\u0430\u043F\u0443\u0441\u0442\u0438\u0442\u044C \u043F\u0440\u043E\u0438\u0433\u0440\u044B\u0432\u0430\u0442\u0435\u043B\u044C YouTube.");
                map.put("get_youtube_app_title", "\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u0435 YouTube");
                map.put("get_youtube_app_text", "\u0427\u0442\u043E\u0431\u044B \u0437\u0430\u043F\u0443\u0441\u0442\u0438\u0442\u044C \u044D\u0442\u0443 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0443, \u0443\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 YouTube.");
                map.put("get_youtube_app_action", "\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044C YouTube");
                map.put("enable_youtube_app_title", "\u0410\u043A\u0442\u0438\u0432\u0430\u0446\u0438\u044F YouTube");
                map.put("enable_youtube_app_text", "\u0427\u0442\u043E\u0431\u044B \u0437\u0430\u043F\u0443\u0441\u0442\u0438\u0442\u044C \u044D\u0442\u0443 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0443, \u0430\u043A\u0442\u0438\u0432\u0438\u0440\u0443\u0439\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 YouTube.");
                map.put("enable_youtube_app_action", "\u0410\u043A\u0442\u0438\u0432\u0438\u0440\u043E\u0432\u0430\u0442\u044C YouTube");
                map.put("update_youtube_app_title", "\u041E\u0431\u043D\u043E\u0432\u043B\u0435\u043D\u0438\u0435 YouTube");
                map.put("update_youtube_app_text", "\u0427\u0442\u043E\u0431\u044B \u0437\u0430\u043F\u0443\u0441\u0442\u0438\u0442\u044C \u044D\u0442\u0443 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0443, \u043E\u0431\u043D\u043E\u0432\u0438\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 YouTube.");
                map.put("update_youtube_app_action", "\u041E\u0431\u043D\u043E\u0432\u0438\u0442\u044C YouTube");
                return;
            }
            if ("sk".equals(s))
            {
                map.put("error_initializing_player", "Pri inicializ\341cii prehr\341va\u010Da YouTube sa vyskytla chyba.");
                map.put("get_youtube_app_title", "Z\355ska\u0165 aplik\341ciu YouTube");
                map.put("get_youtube_app_text", "T\372to aplik\341ciu nebude mo\u017En\351 spusti\u0165 bez aplik\341cie YouTube, ktor\341 na zariaden\355 nie je nain\u0161talovan\341.");
                map.put("get_youtube_app_action", "Z\355ska\u0165 aplik\341ciu YouTube");
                map.put("enable_youtube_app_title", "Povoli\u0165 aplik\341ciu YouTube");
                map.put("enable_youtube_app_text", "T\341to aplik\341cia bude fungova\u0165 a\u017E po povolen\355 aplik\341cie YouTube.");
                map.put("enable_youtube_app_action", "Povoli\u0165 aplik\341ciu YouTube");
                map.put("update_youtube_app_title", "Aktualizova\u0165 apl. YouTube");
                map.put("update_youtube_app_text", "T\341to aplik\341cia bude fungova\u0165 a\u017E po aktualiz\341cii aplik\341cie YouTube.");
                map.put("update_youtube_app_action", "Aktualizova\u0165 apl. YouTube");
                return;
            }
            if ("sl".equals(s))
            {
                map.put("error_initializing_player", "Napaka med inicializacijo YouTubovega predvajalnika.");
                map.put("get_youtube_app_title", "Prenos aplikacije YouTube");
                map.put("get_youtube_app_text", "Ta aplikacija ne bo delovala brez aplikacije YouTube, ki je ni v va\u0161i napravi");
                map.put("get_youtube_app_action", "Prenos aplikacije YouTube");
                map.put("enable_youtube_app_title", "Omog. aplikacije YouTube");
                map.put("enable_youtube_app_text", "Ta aplikacija ne bo delovala, \u010De ne omogo\u010Dite aplikacije YouTube.");
                map.put("enable_youtube_app_action", "Omog. aplikacijo YouTube");
                map.put("update_youtube_app_title", "Posodob. aplikacije YouTube");
                map.put("update_youtube_app_text", "Ta aplikacija ne bo delovala, \u010De ne posodobite aplikacije YouTube.");
                map.put("update_youtube_app_action", "Posod. aplikacijo YouTube");
                return;
            }
            if ("sr".equals(s))
            {
                map.put("error_initializing_player", "\u0414\u043E\u0448\u043B\u043E \u0458\u0435 \u0434\u043E \u0433\u0440\u0435\u0448\u043A\u0435 \u043F\u0440\u0438 \u043F\u043E\u043A\u0440\u0435\u0442\u0430\u045A\u0443 YouTube \u043F\u043B\u0435\u0458\u0435\u0440\u0430.");
                map.put("get_youtube_app_title", "\u041F\u0440\u0435\u0443\u0437\u0438\u043C\u0430\u045A\u0435 \u0430\u043F\u043B\u0438\u043A. YouTube");
                map.put("get_youtube_app_text", "\u041E\u0432\u0430 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0430 \u043D\u0435\u045B\u0435 \u0444\u0443\u043D\u043A\u0446\u0438\u043E\u043D\u0438\u0441\u0430\u0442\u0438 \u0431\u0435\u0437 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0435 YouTube, \u043A\u043E\u0458\u0430 \u043D\u0435\u0434\u043E\u0441\u0442\u0430\u0458\u0435 \u043D\u0430 \u0443\u0440\u0435\u0452\u0430\u0458\u0443");
                map.put("get_youtube_app_action", "\u041F\u0440\u0435\u0443\u0437\u043C\u0438 \u0430\u043F\u043B\u0438\u043A\u0430\u0446. YouTube");
                map.put("enable_youtube_app_title", "\u041E\u043C\u043E\u0433\u0443\u045B\u0430\u0432\u0430\u045A\u0435 \u0430\u043F\u043B. YouTube");
                map.put("enable_youtube_app_text", "\u041E\u0432\u0430 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0435 \u043D\u0435\u045B\u0435 \u0444\u0443\u043D\u043A\u0446\u0438\u043E\u043D\u0438\u0441\u0430\u0442\u0438 \u0430\u043A\u043E \u043D\u0435 \u043E\u043C\u043E\u0433\u0443\u045B\u0438\u0442\u0435 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0443 YouTube.");
                map.put("enable_youtube_app_action", "\u041E\u043C\u043E\u0433\u0443\u045B\u0438 \u0430\u043F\u043B\u0438\u043A\u0430\u0446. YouTube");
                map.put("update_youtube_app_title", "\u0410\u0436\u0443\u0440\u0438\u0440\u0430\u045A\u0435 \u0430\u043F\u043B\u0438\u043A. YouTube");
                map.put("update_youtube_app_text", "\u041E\u0432\u0430 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0435 \u043D\u0435\u045B\u0435 \u0444\u0443\u043D\u043A\u0446\u0438\u043E\u043D\u0438\u0441\u0430\u0442\u0438 \u0430\u043A\u043E \u043D\u0435 \u0430\u0436\u0443\u0440\u0438\u0440\u0430\u0442\u0435 \u0430\u043F\u043B\u0438\u043A\u0430\u0446\u0438\u0458\u0443 YouTube.");
                map.put("update_youtube_app_action", "\u0410\u0436\u0443\u0440\u0438\u0440\u0430\u0458 \u0430\u043F\u043B\u0438\u043A\u0430\u0446. YouTube");
                return;
            }
            if ("sv".equals(s))
            {
                map.put("error_initializing_player", "Ett fel uppstod n\344r YouTube-spelaren skulle startas.");
                map.put("get_youtube_app_title", "H\344mta YouTube-appen");
                map.put("get_youtube_app_text", "YouTube-appen kr\344vs f\366r att den h\344r appen ska kunna k\366ras. Du har inte YouTube-appen p\345 din enhet.");
                map.put("get_youtube_app_action", "H\344mta YouTube-appen");
                map.put("enable_youtube_app_title", "Aktivera YouTube-appen");
                map.put("enable_youtube_app_text", "Du m\345ste aktivera YouTube-appen f\366r att den h\344r appen ska fungera.");
                map.put("enable_youtube_app_action", "Aktivera YouTube-appen");
                map.put("update_youtube_app_title", "Uppdatera YouTube-appen");
                map.put("update_youtube_app_text", "Du m\345ste uppdatera YouTube-appen f\366r att den h\344r appen ska fungera.");
                map.put("update_youtube_app_action", "Uppdatera YouTube-appen");
                return;
            }
            if ("sw".equals(s))
            {
                map.put("error_initializing_player", "Hitilafu ilitokea wakati wa kuanzisha kichezeshi cha YouTube.");
                map.put("get_youtube_app_title", "Pata Programu ya YouTube");
                map.put("get_youtube_app_text", "Programu hii haitaendeshwa bila Programu ya YouTube, ambayo inakosekana kwenye kifaa chako.");
                map.put("get_youtube_app_action", "Pata Programu ya YouTube");
                map.put("enable_youtube_app_title", "Wezesha Programu ya YouTube");
                map.put("enable_youtube_app_text", "Programu hii haitafanya kazi isipokuwa uwezeshe Programu ya YouTube.");
                map.put("enable_youtube_app_action", "Wezesha Programu ya YouTube");
                map.put("update_youtube_app_title", "Sasisha Programu ya YouTube");
                map.put("update_youtube_app_text", "Programu hii haitafanya kazi mpaka usasishe Programu ya YouTube.");
                map.put("update_youtube_app_action", "Sasisha Programu ya YouTube");
                return;
            }
            if ("th".equals(s))
            {
                map.put("error_initializing_player", "\u0E40\u0E01\u0E34\u0E14\u0E02\u0E49\u0E2D\u0E1C\u0E34\u0E14\u0E1E\u0E25\u0E32\u0E14\u0E43\u0E19\u0E02\u0E13\u0E30\u0E40\u0E23\u0E34\u0E48\u0E21\u0E15\u0E49\u0E19\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E40\u0E25\u0E48\u0E19 YouTube");
                map.put("get_youtube_app_title", "\u0E23\u0E31\u0E1A\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                map.put("get_youtube_app_text", "\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19\u0E19\u0E35\u0E49\u0E08\u0E30\u0E44\u0E21\u0E48\u0E17\u0E33\u0E07\u0E32\u0E19\u0E2B\u0E32\u0E01\u0E44\u0E21\u0E48\u0E21\u0E35\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube \u0E0B\u0E36\u0E48\u0E07\u0E44\u0E21\u0E48\u0E21\u0E35\u0E43\u0E19\u0E2D\u0E38\u0E1B\u0E01\u0E23\u0E13\u0E4C\u0E02\u0E2D\u0E07\u0E04\u0E38\u0E13");
                map.put("get_youtube_app_action", "\u0E23\u0E31\u0E1A\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                map.put("enable_youtube_app_title", "\u0E40\u0E1B\u0E34\u0E14\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19\u0E41\u0E2D\u0E1B YouTube");
                map.put("enable_youtube_app_text", "\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19\u0E19\u0E35\u0E49\u0E08\u0E30\u0E44\u0E21\u0E48\u0E17\u0E33\u0E07\u0E32\u0E19\u0E08\u0E19\u0E01\u0E27\u0E48\u0E32\u0E04\u0E38\u0E13\u0E08\u0E30\u0E40\u0E1B\u0E34\u0E14\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                map.put("enable_youtube_app_action", "\u0E40\u0E1B\u0E34\u0E14\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19\u0E41\u0E2D\u0E1B YouTube");
                map.put("update_youtube_app_title", "\u0E2D\u0E31\u0E1B\u0E40\u0E14\u0E15\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                map.put("update_youtube_app_text", "\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19\u0E19\u0E35\u0E49\u0E08\u0E30\u0E44\u0E21\u0E48\u0E17\u0E33\u0E07\u0E32\u0E19\u0E08\u0E19\u0E01\u0E27\u0E48\u0E32\u0E04\u0E38\u0E13\u0E08\u0E30\u0E2D\u0E31\u0E1B\u0E40\u0E14\u0E15\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                map.put("update_youtube_app_action", "\u0E2D\u0E31\u0E1B\u0E40\u0E14\u0E15\u0E41\u0E2D\u0E1B\u0E1E\u0E25\u0E34\u0E40\u0E04\u0E0A\u0E31\u0E19 YouTube");
                return;
            }
            if ("tl".equals(s))
            {
                map.put("error_initializing_player", "May naganap na error habang sinisimulan ang player ng YouTube.");
                map.put("get_youtube_app_title", "Kunin ang YouTube App");
                map.put("get_youtube_app_text", "Hindi gagana ang app na ito nang wala ang YouTube App, na nawawala sa iyong device");
                map.put("get_youtube_app_action", "Kunin ang YouTube App");
                map.put("enable_youtube_app_title", "Paganahin ang YouTube App");
                map.put("enable_youtube_app_text", "Hindi gagana ang app na ito maliban kung paganahin mo ang YouTube App.");
                map.put("enable_youtube_app_action", "Paganahin ang YouTube App");
                map.put("update_youtube_app_title", "I-update ang YouTube App");
                map.put("update_youtube_app_text", "Hindi gagana ang app na ito maliban kung i-update mo ang YouTube App.");
                map.put("update_youtube_app_action", "I-update ang YouTube App");
                return;
            }
            if ("tr".equals(s))
            {
                map.put("error_initializing_player", "YouTube oynat\u0131c\u0131s\u0131 ba\u015Flat\u0131l\u0131rken bir hata olu\u015Ftu.");
                map.put("get_youtube_app_title", "YouTube Uygulamas\u0131n\u0131 edinin");
                map.put("get_youtube_app_text", "Cihaz\u0131n\u0131zda bulunmayan YouTube Uygulamas\u0131 olmadan bu uygulama \347al\u0131\u015Fmaz");
                map.put("get_youtube_app_action", "YouTube Uygulamas\u0131n\u0131 edinin");
                map.put("enable_youtube_app_title", "YouTube Uygulamas\u0131n\u0131 etkinle\u015Ftirin");
                map.put("enable_youtube_app_text", "YouTube Uygulamas\u0131n\u0131 etkinle\u015Ftirmedi\u011Finiz s\374rece bu uygulama \347al\u0131\u015Fmaz.");
                map.put("enable_youtube_app_action", "YouTube Uygulamas\u0131n\u0131 etkinle\u015Ftirin");
                map.put("update_youtube_app_title", "YouTube Uygulamas\u0131n\u0131 g\374ncelleyin");
                map.put("update_youtube_app_text", "YouTube Uygulamas\u0131 g\374ncellenmedik\347e bu uygulama \347al\u0131\u015Fmaz.");
                map.put("update_youtube_app_action", "YouTube Uygulamas\u0131n\u0131 g\374ncelle");
                return;
            }
            if ("uk".equals(s))
            {
                map.put("error_initializing_player", "\u041F\u0456\u0434 \u0447\u0430\u0441 \u0456\u043D\u0456\u0446\u0456\u0430\u043B\u0456\u0437\u0430\u0446\u0456\u0457 \u043F\u0440\u043E\u0433\u0440\u0430\u0432\u0430\u0447\u0430 YouTube \u0441\u0442\u0430\u043B\u0430\u0441\u044F \u043F\u043E\u043C\u0438\u043B\u043A\u0430.");
                map.put("get_youtube_app_title", "\u041E\u0442\u0440\u0438\u043C\u0430\u0442\u0438 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                map.put("get_youtube_app_text", "\u0426\u044F \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0430 \u043D\u0435 \u0437\u0430\u043F\u0443\u0441\u0442\u0438\u0442\u044C\u0441\u044F \u0431\u0435\u0437 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0438 YouTube, \u044F\u043A\u0443 \u043D\u0435 \u0432\u0441\u0442\u0430\u043D\u043E\u0432\u043B\u0435\u043D\u043E \u043D\u0430 \u0432\u0430\u0448\u043E\u043C\u0443 \u043F\u0440\u0438\u0441\u0442\u0440\u043E\u0457");
                map.put("get_youtube_app_action", "\u041E\u0442\u0440\u0438\u043C\u0430\u0442\u0438 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                map.put("enable_youtube_app_title", "\u0423\u0432\u0456\u043C\u043A. \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                map.put("enable_youtube_app_text", "\u0426\u044F \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0430 \u043D\u0435 \u043F\u0440\u0430\u0446\u044E\u0432\u0430\u0442\u0438\u043C\u0435, \u043F\u043E\u043A\u0438 \u0432\u0438 \u043D\u0435 \u0432\u0432\u0456\u043C\u043A\u043D\u0435\u0442\u0435 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube.");
                map.put("enable_youtube_app_action", "\u0423\u0432\u0456\u043C\u043A. \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                map.put("update_youtube_app_title", "\u041E\u043D\u043E\u0432\u0438\u0442\u0438 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                map.put("update_youtube_app_text", "\u0426\u044F \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0430 \u043D\u0435 \u043F\u0440\u0430\u0446\u044E\u0432\u0430\u0442\u0438\u043C\u0435, \u043F\u043E\u043A\u0438 \u0432\u0438 \u043D\u0435 \u043E\u043D\u043E\u0432\u0438\u0442\u0435 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube.");
                map.put("update_youtube_app_action", "\u041E\u043D\u043E\u0432\u0438\u0442\u0438 \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u0443 YouTube");
                return;
            }
            if ("vi".equals(s))
            {
                map.put("error_initializing_player", "\u0110\343 x\u1EA3y ra l\u1ED7i trong khi kh\u1EDFi ch\u1EA1y tr\354nh ph\341t YouTube.");
                map.put("get_youtube_app_title", "T\u1EA3i \u1EE9ng d\u1EE5ng YouTube");
                map.put("get_youtube_app_text", "\u1EE8ng d\u1EE5ng n\340y s\u1EBD kh\364ng ch\u1EA1y n\u1EBFu kh\364ng c\363 \u1EE9ng d\u1EE5ng YouTube, \u1EE9ng d\u1EE5ng n\340y b\u1ECB thi\u1EBFu trong thi\u1EBFt b\u1ECB c\u1EE7a b\u1EA1n");
                map.put("get_youtube_app_action", "T\u1EA3i \u1EE9ng d\u1EE5ng YouTube");
                map.put("enable_youtube_app_title", "B\u1EADt \u1EE9ng d\u1EE5ng YouTube");
                map.put("enable_youtube_app_text", "\u1EE8ng d\u1EE5ng n\340y s\u1EBD kh\364ng ho\u1EA1t \u0111\u1ED9ng tr\u1EEB khi b\u1EA1n b\u1EADt \u1EE9ng d\u1EE5ng YouTube.");
                map.put("enable_youtube_app_action", "B\u1EADt \u1EE9ng d\u1EE5ng YouTube");
                map.put("update_youtube_app_title", "C\u1EADp nh\u1EADt \u1EE9ng d\u1EE5ng YouTube");
                map.put("update_youtube_app_text", "\u1EE8ng d\u1EE5ng n\340y s\u1EBD kh\364ng ho\u1EA1t \u0111\u1ED9ng tr\u1EEB khi b\u1EA1n c\u1EADp nh\u1EADt \u1EE9ng d\u1EE5ng YouTube.");
                map.put("update_youtube_app_action", "C\u1EADp nh\u1EADt \u1EE9ng d\u1EE5ng YouTube");
                return;
            }
            if ("zh_CN".equals(s))
            {
                map.put("error_initializing_player", "\u521D\u59CB\u5316 YouTube \u64AD\u653E\u5668\u65F6\u51FA\u73B0\u9519\u8BEF\u3002");
                map.put("get_youtube_app_title", "\u83B7\u53D6 YouTube \u5E94\u7528");
                map.put("get_youtube_app_text", "\u60A8\u7684\u8BBE\u5907\u4E2D\u6CA1\u6709 YouTube \u5E94\u7528\uFF0C\u60A8\u5FC5\u987B\u5148\u5B89\u88C5 YouTube \u5E94\u7528\u624D\u80FD\u8FD0\u884C\u6B64\u5E94\u7528\u3002");
                map.put("get_youtube_app_action", "\u83B7\u53D6 YouTube \u5E94\u7528");
                map.put("enable_youtube_app_title", "\u542F\u7528 YouTube \u5E94\u7528");
                map.put("enable_youtube_app_text", "\u60A8\u9700\u8981\u542F\u7528 YouTube \u5E94\u7528\u624D\u80FD\u8FD0\u884C\u8BE5\u5E94\u7528\u3002");
                map.put("enable_youtube_app_action", "\u542F\u7528 YouTube \u5E94\u7528");
                map.put("update_youtube_app_title", "\u66F4\u65B0 YouTube \u5E94\u7528");
                map.put("update_youtube_app_text", "\u60A8\u5FC5\u987B\u66F4\u65B0 YouTube \u5E94\u7528\u624D\u80FD\u8FD0\u884C\u6B64\u5E94\u7528\u3002");
                map.put("update_youtube_app_action", "\u66F4\u65B0 YouTube \u5E94\u7528");
                return;
            }
            if ("zh_TW".equals(s))
            {
                map.put("error_initializing_player", "\u521D\u59CB\u5316 YouTube \u64AD\u653E\u5668\u6642\u767C\u751F\u932F\u8AA4\u3002");
                map.put("get_youtube_app_title", "\u53D6\u5F97 YouTube \u61C9\u7528\u7A0B\u5F0F");
                map.put("get_youtube_app_text", "\u60A8\u5FC5\u9808\u555F\u7528 YouTube \u61C9\u7528\u7A0B\u5F0F\uFF0C\u9019\u500B\u61C9\u7528\u7A0B\u5F0F\u624D\u80FD\u904B\u4F5C\uFF0C\u4F46\u7CFB\u7D71\u5728\u88DD\u7F6E\u4E2D\u627E\u4E0D\u5230 YouTube \u61C9\u7528\u7A0B\u5F0F\u3002");
                map.put("get_youtube_app_action", "\u53D6\u5F97 YouTube \u61C9\u7528\u7A0B\u5F0F");
                map.put("enable_youtube_app_title", "\u555F\u7528 YouTube \u61C9\u7528\u7A0B\u5F0F");
                map.put("enable_youtube_app_text", "\u60A8\u5FC5\u9808\u555F\u7528 YouTube \u61C9\u7528\u7A0B\u5F0F\uFF0C\u9019\u500B\u61C9\u7528\u7A0B\u5F0F\u624D\u80FD\u904B\u4F5C\u3002");
                map.put("enable_youtube_app_action", "\u555F\u7528 YouTube \u61C9\u7528\u7A0B\u5F0F");
                map.put("update_youtube_app_title", "\u66F4\u65B0 YouTube \u61C9\u7528\u7A0B\u5F0F");
                map.put("update_youtube_app_text", "\u60A8\u5FC5\u9808\u66F4\u65B0 YouTube \u61C9\u7528\u7A0B\u5F0F\uFF0C\u9019\u500B\u61C9\u7528\u7A0B\u5F0F\u624D\u80FD\u904B\u4F5C\u3002");
                map.put("update_youtube_app_action", "\u66F4\u65B0 YouTube \u61C9\u7528\u7A0B\u5F0F");
                return;
            }
            if ("zu".equals(s))
            {
                map.put("error_initializing_player", "Kuvele iphutha ngenkathi kuqaliswa isidlali se-YouTube");
                map.put("get_youtube_app_title", "Thola uhlelo lokusebenza lwe-YouTube");
                map.put("get_youtube_app_text", "Lolu hlelo kusebenza angeke lusebenze ngaphandle kohlelo lokusebenza lwe-YouTube, olungekho kudivayisi yakho");
                map.put("get_youtube_app_action", "Thola uhelo lokusebenza lwe-YouTube");
                map.put("enable_youtube_app_title", "Nika amandla uhlelo lokusebenza lwe-YouTube");
                map.put("enable_youtube_app_text", "Lolu hlelo lokusebenza angeke lusebenze uma unganikanga amandla uhlelo lokusebenza lwe-YouTube.");
                map.put("enable_youtube_app_action", "Nika amandla uhlelo lokusebenza lwe-YouTube");
                map.put("update_youtube_app_title", "Buyekeza uhlelo lokusebenza lwe-YouTube");
                map.put("update_youtube_app_text", "Lolu hlelo lokusebenza angeke lusebenze uma ungabuyekezanga uhlelo lokusebenza lwe-YouTube.");
                map.put("update_youtube_app_action", "Buyekeza uhlelo lokusebenza lwe-YouTube");
                return;
            }
        }
    }
}
