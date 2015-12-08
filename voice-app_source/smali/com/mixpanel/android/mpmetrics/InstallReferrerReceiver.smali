.class public Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;
.super Landroid/content/BroadcastReceiver;
.source "InstallReferrerReceiver.java"


# static fields
.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.InstRfrRcvr"


# instance fields
.field private final UTM_CAMPAIGN_PATTERN:Ljava/util/regex/Pattern;

.field private final UTM_CONTENT_PATTERN:Ljava/util/regex/Pattern;

.field private final UTM_MEDIUM_PATTERN:Ljava/util/regex/Pattern;

.field private final UTM_SOURCE_PATTERN:Ljava/util/regex/Pattern;

.field private final UTM_TERM_PATTERN:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 115
    const-string v0, "(^|&)utm_source=([^&#=]*)([#&]|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_SOURCE_PATTERN:Ljava/util/regex/Pattern;

    .line 116
    const-string v0, "(^|&)utm_medium=([^&#=]*)([#&]|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_MEDIUM_PATTERN:Ljava/util/regex/Pattern;

    .line 117
    const-string v0, "(^|&)utm_campaign=([^&#=]*)([#&]|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_CAMPAIGN_PATTERN:Ljava/util/regex/Pattern;

    .line 118
    const-string v0, "(^|&)utm_content=([^&#=]*)([#&]|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_CONTENT_PATTERN:Ljava/util/regex/Pattern;

    .line 119
    const-string v0, "(^|&)utm_term=([^&#=]*)([#&]|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_TERM_PATTERN:Ljava/util/regex/Pattern;

    .line 53
    return-void
.end method

.method private find(Ljava/util/regex/Matcher;)Ljava/lang/String;
    .locals 4
    .param p1, "matcher"    # Ljava/util/regex/Matcher;

    .prologue
    .line 102
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 103
    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 104
    .local v1, "encoded":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 106
    :try_start_0
    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 112
    .end local v1    # "encoded":Ljava/lang/String;
    :goto_0
    return-object v2

    .line 107
    .restart local v1    # "encoded":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 108
    .local v0, "e":Ljava/io/UnsupportedEncodingException;
    const-string v2, "MixpanelAPI.InstRfrRcvr"

    const-string v3, "Could not decode a parameter into UTF-8"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
    .end local v1    # "encoded":Ljava/lang/String;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 14
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 56
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 57
    .local v4, "extras":Landroid/os/Bundle;
    if-nez v4, :cond_1

    .line 99
    :cond_0
    :goto_0
    return-void

    .line 60
    :cond_1
    const-string v13, "referrer"

    invoke-virtual {v4, v13}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 61
    .local v8, "referrer":Ljava/lang/String;
    if-eqz v8, :cond_0

    .line 65
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 66
    .local v7, "newPrefs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v13, "referrer"

    invoke-interface {v7, v13, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v13, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_SOURCE_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    .line 69
    .local v10, "sourceMatcher":Ljava/util/regex/Matcher;
    invoke-direct {p0, v10}, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->find(Ljava/util/regex/Matcher;)Ljava/lang/String;

    move-result-object v9

    .line 70
    .local v9, "source":Ljava/lang/String;
    if-eqz v9, :cond_2

    .line 71
    const-string v13, "utm_source"

    invoke-interface {v7, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    :cond_2
    iget-object v13, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_MEDIUM_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 75
    .local v6, "mediumMatcher":Ljava/util/regex/Matcher;
    invoke-direct {p0, v6}, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->find(Ljava/util/regex/Matcher;)Ljava/lang/String;

    move-result-object v5

    .line 76
    .local v5, "medium":Ljava/lang/String;
    if-eqz v5, :cond_3

    .line 77
    const-string v13, "utm_medium"

    invoke-interface {v7, v13, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_3
    iget-object v13, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_CAMPAIGN_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 81
    .local v1, "campaignMatcher":Ljava/util/regex/Matcher;
    invoke-direct {p0, v1}, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->find(Ljava/util/regex/Matcher;)Ljava/lang/String;

    move-result-object v0

    .line 82
    .local v0, "campaign":Ljava/lang/String;
    if-eqz v0, :cond_4

    .line 83
    const-string v13, "utm_campaign"

    invoke-interface {v7, v13, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :cond_4
    iget-object v13, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_CONTENT_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 87
    .local v3, "contentMatcher":Ljava/util/regex/Matcher;
    invoke-direct {p0, v3}, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->find(Ljava/util/regex/Matcher;)Ljava/lang/String;

    move-result-object v2

    .line 88
    .local v2, "content":Ljava/lang/String;
    if-eqz v2, :cond_5

    .line 89
    const-string v13, "utm_content"

    invoke-interface {v7, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    :cond_5
    iget-object v13, p0, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->UTM_TERM_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    .line 93
    .local v12, "termMatcher":Ljava/util/regex/Matcher;
    invoke-direct {p0, v12}, Lcom/mixpanel/android/mpmetrics/InstallReferrerReceiver;->find(Ljava/util/regex/Matcher;)Ljava/lang/String;

    move-result-object v11

    .line 94
    .local v11, "term":Ljava/lang/String;
    if-eqz v11, :cond_6

    .line 95
    const-string v13, "utm_term"

    invoke-interface {v7, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    :cond_6
    const-string v13, "com.mixpanel.android.mpmetrics.ReferralInfo"

    invoke-static {p1, v13, v7}, Lcom/mixpanel/android/mpmetrics/PersistentIdentity;->writeReferrerPrefs(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method
