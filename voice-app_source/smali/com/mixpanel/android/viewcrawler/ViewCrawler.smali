.class public Lcom/mixpanel/android/viewcrawler/ViewCrawler;
.super Ljava/lang/Object;
.source "ViewCrawler.java"

# interfaces
.implements Lcom/mixpanel/android/viewcrawler/UpdatesFromMixpanel;
.implements Lcom/mixpanel/android/viewcrawler/TrackingDebug;
.implements Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$Editor;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$EmulatorConnector;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$MessageType;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantChange;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;,
        Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    }
.end annotation


# static fields
.field private static final EMULATOR_CONNECT_ATTEMPT_INTERVAL_MILLIS:I = 0x7530

.field private static final LOGTAG:Ljava/lang/String; = "MixpanelAPI.ViewCrawler"

.field private static final MESSAGE_CONNECT_TO_EDITOR:I = 0x1

.field private static final MESSAGE_EVENT_BINDINGS_RECEIVED:I = 0x5

.field private static final MESSAGE_HANDLE_EDITOR_BINDINGS_RECEIVED:I = 0x6

.field private static final MESSAGE_HANDLE_EDITOR_CHANGES_CLEARED:I = 0xa

.field private static final MESSAGE_HANDLE_EDITOR_CHANGES_RECEIVED:I = 0x3

.field private static final MESSAGE_HANDLE_EDITOR_CLOSED:I = 0x8

.field private static final MESSAGE_HANDLE_EDITOR_TWEAKS_RECEIVED:I = 0xb

.field private static final MESSAGE_INITIALIZE_CHANGES:I = 0x0

.field private static final MESSAGE_SEND_DEVICE_INFO:I = 0x4

.field private static final MESSAGE_SEND_EVENT_TRACKED:I = 0x7

.field private static final MESSAGE_SEND_LAYOUT_ERROR:I = 0xc

.field private static final MESSAGE_SEND_STATE_FOR_EDITING:I = 0x2

.field private static final MESSAGE_VARIANTS_RECEIVED:I = 0x9

.field private static final SHARED_PREF_BINDINGS_KEY:Ljava/lang/String; = "mixpanel.viewcrawler.bindings"

.field private static final SHARED_PREF_CHANGES_KEY:Ljava/lang/String; = "mixpanel.viewcrawler.changes"

.field private static final SHARED_PREF_EDITS_FILE:Ljava/lang/String; = "mixpanel.viewcrawler.changes"


# instance fields
.field private final mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

.field private final mDeviceInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mEditState:Lcom/mixpanel/android/viewcrawler/EditState;

.field private final mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

.field private final mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field private final mScaledDensity:F

.field private final mTracker:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

.field private final mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

.field private final mVariantTracker:Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/Tweaks;)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "token"    # Ljava/lang/String;
    .param p3, "mixpanel"    # Lcom/mixpanel/android/mpmetrics/MixpanelAPI;
    .param p4, "tweaks"    # Lcom/mixpanel/android/mpmetrics/Tweaks;

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-static {p1}, Lcom/mixpanel/android/mpmetrics/MPConfig;->getInstance(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/MPConfig;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    .line 67
    new-instance v0, Lcom/mixpanel/android/viewcrawler/EditState;

    invoke-direct {v0}, Lcom/mixpanel/android/viewcrawler/EditState;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;

    .line 68
    iput-object p4, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    .line 69
    invoke-virtual {p3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mDeviceInfo:Ljava/util/Map;

    .line 70
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    iput v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mScaledDensity:F

    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    check-cast v6, Landroid/app/Application;

    .line 73
    .local v6, "app":Landroid/app/Application;
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;

    invoke-direct {v0, p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$LifecycleCallbacks;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)V

    invoke-virtual {v6, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 75
    new-instance v10, Landroid/os/HandlerThread;

    const-class v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 76
    .local v10, "thread":Landroid/os/HandlerThread;
    const/16 v0, 0xa

    invoke-virtual {v10, v0}, Landroid/os/HandlerThread;->setPriority(I)V

    .line 77
    invoke-virtual {v10}, Landroid/os/HandlerThread;->start()V

    .line 78
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v10}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;Lcom/mixpanel/android/viewcrawler/ViewVisitor$OnLayoutErrorListener;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    .line 80
    new-instance v0, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-direct {v0, p3, v1}, Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTracker:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    .line 81
    new-instance v0, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;

    invoke-direct {v0, p3}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;)V

    iput-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mVariantTracker:Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;

    .line 88
    :try_start_0
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v9

    .line 89
    .local v9, "sslContext":Ljavax/net/ssl/SSLContext;
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v9, v0, v1, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 90
    invoke-virtual {v9}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 95
    .end local v9    # "sslContext":Ljavax/net/ssl/SSLContext;
    .local v8, "foundSSLFactory":Ljavax/net/ssl/SSLSocketFactory;
    :goto_0
    iput-object v8, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 97
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    new-instance v1, Lcom/mixpanel/android/viewcrawler/ViewCrawler$1;

    invoke-direct {v1, p0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$1;-><init>(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)V

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/mpmetrics/Tweaks;->addOnTweakDeclaredListener(Lcom/mixpanel/android/mpmetrics/Tweaks$OnTweakDeclaredListener;)V

    .line 104
    return-void

    .line 91
    .end local v8    # "foundSSLFactory":Ljavax/net/ssl/SSLSocketFactory;
    :catch_0
    move-exception v7

    .line 92
    .local v7, "e":Ljava/security/GeneralSecurityException;
    const-string v0, "MixpanelAPI.ViewCrawler"

    const-string v1, "System has no SSL support. Built-in events editor will not be available"

    invoke-static {v0, v1, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 93
    const/4 v8, 0x0

    .restart local v8    # "foundSSLFactory":Ljavax/net/ssl/SSLSocketFactory;
    goto :goto_0
.end method

.method static synthetic access$0(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;
    .locals 1

    .prologue
    .line 1065
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    return-object v0
.end method

.method static synthetic access$1(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/EditState;
    .locals 1

    .prologue
    .line 1062
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mEditState:Lcom/mixpanel/android/viewcrawler/EditState;

    return-object v0
.end method

.method static synthetic access$2(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/MPConfig;
    .locals 1

    .prologue
    .line 1059
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mConfig:Lcom/mixpanel/android/mpmetrics/MPConfig;

    return-object v0
.end method

.method static synthetic access$3(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/mpmetrics/Tweaks;
    .locals 1

    .prologue
    .line 1063
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    return-object v0
.end method

.method static synthetic access$4(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .prologue
    .line 1061
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mSSLSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method static synthetic access$5(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)F
    .locals 1

    .prologue
    .line 1067
    iget v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mScaledDensity:F

    return v0
.end method

.method static synthetic access$6(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 1064
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mDeviceInfo:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$7(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;
    .locals 1

    .prologue
    .line 1060
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTracker:Lcom/mixpanel/android/viewcrawler/DynamicEventTracker;

    return-object v0
.end method

.method static synthetic access$8(Lcom/mixpanel/android/viewcrawler/ViewCrawler;)Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;
    .locals 1

    .prologue
    .line 1066
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mVariantTracker:Lcom/mixpanel/android/viewcrawler/ViewCrawler$VariantTracker;

    return-object v0
.end method


# virtual methods
.method public getTweaks()Lcom/mixpanel/android/mpmetrics/Tweaks;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mTweaks:Lcom/mixpanel/android/mpmetrics/Tweaks;

    return-object v0
.end method

.method public onLayoutError(Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;)V
    .locals 2
    .param p1, "e"    # Lcom/mixpanel/android/viewcrawler/ViewVisitor$LayoutErrorMessage;

    .prologue
    .line 142
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 143
    .local v0, "m":Landroid/os/Message;
    const/16 v1, 0xc

    iput v1, v0, Landroid/os/Message;->what:I

    .line 144
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 145
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 146
    return-void
.end method

.method public reportTrack(Ljava/lang/String;)V
    .locals 2
    .param p1, "eventName"    # Ljava/lang/String;

    .prologue
    .line 133
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 134
    .local v0, "m":Landroid/os/Message;
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 135
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 137
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 138
    return-void
.end method

.method public setEventBindings(Lorg/json/JSONArray;)V
    .locals 3
    .param p1, "bindings"    # Lorg/json/JSONArray;

    .prologue
    .line 119
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 120
    .local v0, "msg":Landroid/os/Message;
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 121
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 122
    return-void
.end method

.method public setVariants(Lorg/json/JSONArray;)V
    .locals 3
    .param p1, "variants"    # Lorg/json/JSONArray;

    .prologue
    .line 126
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 127
    .local v0, "msg":Landroid/os/Message;
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 128
    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 129
    return-void
.end method

.method public startUpdates()V
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    invoke-virtual {v0}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->start()V

    .line 109
    iget-object v0, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    iget-object v1, p0, Lcom/mixpanel/android/viewcrawler/ViewCrawler;->mMessageThreadHandler:Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/viewcrawler/ViewCrawler$ViewCrawlerHandler;->sendMessage(Landroid/os/Message;)Z

    .line 110
    return-void
.end method
