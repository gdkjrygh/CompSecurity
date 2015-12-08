.class Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;
.super Ljava/lang/Object;
.source "AnalyticsMessages.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/AnalyticsMessages;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EventDescription"
.end annotation


# instance fields
.field private final eventName:Ljava/lang/String;

.field private final properties:Lorg/json/JSONObject;

.field private final token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "properties"    # Lorg/json/JSONObject;
    .param p3, "token"    # Ljava/lang/String;

    .prologue
    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->eventName:Ljava/lang/String;

    .line 143
    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->properties:Lorg/json/JSONObject;

    .line 144
    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->token:Ljava/lang/String;

    .line 145
    return-void
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public getProperties()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->properties:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/AnalyticsMessages$EventDescription;->token:Ljava/lang/String;

    return-object v0
.end method
