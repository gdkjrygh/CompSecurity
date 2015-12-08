.class public Lcom/comscore/metrics/Request;
.super Ljava/lang/Object;


# static fields
.field public static final REDIRECTION_SUPPORTED:Z


# instance fields
.field protected a:Ljava/net/URL;

.field protected b:Ljava/net/Proxy;

.field private c:Lcom/comscore/measurement/Measurement;

.field private d:Lcom/comscore/analytics/Core;

.field private e:Lcom/comscore/utils/Storage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/16 v1, 0xd

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/comscore/metrics/Request;->REDIRECTION_SUPPORTED:Z

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/comscore/analytics/Core;Lcom/comscore/measurement/Measurement;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {p1}, Lcom/comscore/analytics/Core;->getStorage()Lcom/comscore/utils/Storage;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/metrics/Request;->e:Lcom/comscore/utils/Storage;

    iput-object p2, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    invoke-virtual {p0}, Lcom/comscore/metrics/Request;->process()Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/metrics/Request;->a:Ljava/net/URL;

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/net/Proxy;
    .locals 4

    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move-object p0, v1

    :goto_0
    new-instance v1, Ljava/net/Proxy;

    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v3, Ljava/net/InetSocketAddress;

    invoke-direct {v3, p0, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, v2, v3}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    return-object v1

    :cond_0
    const/16 v0, 0x50

    goto :goto_0
.end method

.method private c()Z
    .locals 1

    invoke-direct {p0}, Lcom/comscore/metrics/Request;->d()V

    invoke-virtual {p0}, Lcom/comscore/metrics/Request;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    :cond_0
    return v0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getOfflineTransmissionMode()Lcom/comscore/utils/TransmissionMode;

    move-result-object v0

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->DEFAULT:Lcom/comscore/utils/TransmissionMode;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/comscore/utils/TransmissionMode;->WIFIONLY:Lcom/comscore/utils/TransmissionMode;

    if-ne v0, v1, :cond_0

    iget-object v1, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/comscore/utils/Connectivity;->isConnectedWiFi(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lcom/comscore/utils/TransmissionMode;->PIGGYBACK:Lcom/comscore/utils/TransmissionMode;

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getOfflineCache()Lcom/comscore/utils/OfflineMeasurementsCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/comscore/utils/OfflineMeasurementsCache;->flush()Z

    :cond_2
    return-void
.end method

.method private e()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Measurement was not transmitted: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    iget-object v2, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v2}, Lcom/comscore/analytics/Core;->getMeasurementLabelOrder()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/comscore/measurement/Measurement;->retrieveLabelsAsString([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/comscore/utils/CSLog;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getOfflineCache()Lcom/comscore/utils/OfflineMeasurementsCache;

    move-result-object v0

    iget-object v1, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    invoke-virtual {v0, v1}, Lcom/comscore/utils/OfflineMeasurementsCache;->saveEvent(Lcom/comscore/measurement/Measurement;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 1

    iget-object v0, p0, Lcom/comscore/metrics/Request;->b:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/comscore/metrics/Request;->b:Ljava/net/Proxy;

    invoke-virtual {p1, v0}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    goto :goto_0
.end method

.method protected a(Ljava/net/URL;ILjava/lang/String;)Ljava/net/URL;
    .locals 4

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    move-object p1, v0

    :goto_0
    return-object p1

    :pswitch_1
    if-nez p3, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    const/16 v1, 0x131

    if-ne p2, v1, :cond_3

    const/4 v0, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :cond_1
    const-string v1, "//"

    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, 0x2

    :cond_2
    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/comscore/metrics/Request;->a(Ljava/lang/String;)Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Lcom/comscore/metrics/Request;->b:Ljava/net/Proxy;

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1, p3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move-object p1, v0

    goto :goto_0

    :cond_4
    move-object p1, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected a()Z
    .locals 7

    const/4 v2, 0x0

    const/4 v1, 0x0

    const-string v0, "http.keepAlive"

    const-string v3, "false"

    invoke-static {v0, v3}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lcom/comscore/metrics/Request;->a:Ljava/net/URL;

    invoke-virtual {p0}, Lcom/comscore/metrics/Request;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v0}, Lcom/comscore/metrics/Request;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    :try_start_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    :cond_0
    const-string v3, "Content-Type"

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Content-Length"

    invoke-virtual {v1, v4}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xc8

    if-ne v0, v5, :cond_1

    invoke-static {v3}, Lcom/comscore/utils/Utils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "image/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v4}, Lcom/comscore/utils/Utils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-gtz v3, :cond_2

    :cond_1
    const/16 v3, 0xcc

    if-ne v0, v3, :cond_3

    invoke-static {v4}, Lcom/comscore/utils/Utils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v2, 0x1

    iget-object v0, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getKeepAliveAlarmReceiver()Lcom/comscore/applications/KeepAliveAlarmReceiver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/comscore/applications/KeepAliveAlarmReceiver;->reset()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    move v0, v2

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    :goto_0
    return v0

    :cond_5
    move v3, v2

    move-object v5, v0

    move v0, v2

    :goto_1
    if-eqz v5, :cond_0

    const/4 v4, 0x5

    if-ge v3, v4, :cond_0

    :try_start_2
    invoke-virtual {p0, v5}, Lcom/comscore/metrics/Request;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v1

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    const-string v0, "Location"

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v5, v4, v0}, Lcom/comscore/metrics/Request;->a(Ljava/net/URL;ILjava/lang/String;)Ljava/net/URL;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v5

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v0, v4

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v6, v0

    move v0, v2

    move-object v2, v1

    move-object v1, v6

    :goto_2
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception sending measurement:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Lcom/comscore/utils/CSLog;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/comscore/utils/CSLog;->printStackTrace(Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v6, v0

    move v0, v2

    move-object v2, v1

    move-object v1, v6

    goto :goto_2
.end method

.method public availableConnection()Ljava/lang/Boolean;
    .locals 5

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v0}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {}, Lcom/comscore/utils/Connectivity;->isEmulator()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v0, "emu"

    :goto_0
    iget-object v3, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    const-string v4, "ns_radio"

    invoke-virtual {v3, v4, v0}, Lcom/comscore/measurement/Measurement;->setLabel(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/comscore/utils/Connectivity;->isConnectedWiFi(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v0, "wifi"

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/comscore/utils/Connectivity;->isConnectedMobile(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "wwan"

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/comscore/utils/Connectivity;->isConnectBluetooth(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v0, "bth"

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lcom/comscore/utils/Connectivity;->isConnectEthernet(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "eth"

    goto :goto_0

    :cond_4
    const-string v0, "unknown"
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move v1, v2

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1
.end method

.method protected b()Z
    .locals 1

    sget-boolean v0, Lcom/comscore/metrics/Request;->REDIRECTION_SUPPORTED:Z

    return v0
.end method

.method public process()Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    invoke-virtual {v0}, Lcom/comscore/measurement/Measurement;->getPixelURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/comscore/metrics/Request;->process(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public process(Ljava/lang/String;)Ljava/net/URL;
    .locals 7

    const/16 v6, 0x1000

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/comscore/metrics/Request;->availableConnection()Ljava/lang/Boolean;

    iget-object v0, p0, Lcom/comscore/metrics/Request;->c:Lcom/comscore/measurement/Measurement;

    iget-object v1, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->getMeasurementLabelOrder()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/comscore/measurement/Measurement;->retrieveLabelsAsString([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v6, :cond_1

    const-string v0, "&"

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    const/16 v0, 0xff8

    invoke-virtual {v1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "&"

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const-string v0, ""

    add-int/lit8 v0, v2, 0x1

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "UTF-8"

    invoke-static {v0, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "+"

    const-string v4, "%20"

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&ns_cut="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v6, :cond_0

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_2
    :try_start_1
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "0"

    goto :goto_0

    :catch_1
    move-exception v0

    const/4 v0, 0x0

    goto :goto_3

    :cond_0
    move-object v1, v0

    goto :goto_2

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public send()Z
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v1}, Lcom/comscore/analytics/Core;->getAppContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v1, v2}, Lcom/comscore/utils/Permissions;->check(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lcom/comscore/metrics/Request;->d:Lcom/comscore/analytics/Core;

    invoke-virtual {v3}, Lcom/comscore/analytics/Core;->getLiveTransmissionMode()Lcom/comscore/utils/TransmissionMode;

    move-result-object v3

    iget-object v4, p0, Lcom/comscore/metrics/Request;->e:Lcom/comscore/utils/Storage;

    const-string v5, "lastTransmission"

    invoke-static {}, Lcom/comscore/utils/Date;->unixTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/comscore/utils/Storage;->set(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v4, Lcom/comscore/metrics/a;->a:[I

    invoke-virtual {v3}, Lcom/comscore/utils/TransmissionMode;->ordinal()I

    move-result v3

    aget v3, v4, v3

    packed-switch v3, :pswitch_data_0

    :goto_0
    return v0

    :pswitch_0
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    goto :goto_0

    :pswitch_2
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/comscore/metrics/Request;->availableConnection()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->c()Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    goto :goto_0

    :pswitch_3
    if-eqz v2, :cond_2

    invoke-static {}, Lcom/comscore/utils/Connectivity;->isEmulator()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Lcom/comscore/utils/Connectivity;->isConnectedWiFi(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Lcom/comscore/utils/Connectivity;->isConnectEthernet(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->c()Z

    move-result v0

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    goto :goto_0

    :pswitch_4
    if-eqz v2, :cond_4

    invoke-static {}, Lcom/comscore/utils/Connectivity;->isEmulator()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Lcom/comscore/utils/Connectivity;->isConnectedWiFi(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Lcom/comscore/utils/Connectivity;->isDataConnected(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->c()Z

    move-result v0

    goto :goto_0

    :cond_5
    invoke-direct {p0}, Lcom/comscore/metrics/Request;->e()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
