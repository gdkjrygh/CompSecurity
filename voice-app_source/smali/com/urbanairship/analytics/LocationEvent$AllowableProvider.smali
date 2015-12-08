.class public final enum Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;
.super Ljava/lang/Enum;
.source "LocationEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/urbanairship/analytics/LocationEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AllowableProvider"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

.field public static final enum GPS:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

.field public static final enum NETWORK:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

.field public static final enum PASSIVE:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

.field public static final enum UNKNOWN:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 67
    new-instance v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    const-string v1, "GPS"

    invoke-direct {v0, v1, v2}, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->GPS:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    new-instance v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    const-string v1, "NETWORK"

    invoke-direct {v0, v1, v3}, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->NETWORK:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    new-instance v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    const-string v1, "PASSIVE"

    invoke-direct {v0, v1, v4}, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->PASSIVE:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    new-instance v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v5}, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->UNKNOWN:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    .line 66
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    sget-object v1, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->GPS:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    aput-object v1, v0, v2

    sget-object v1, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->NETWORK:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    aput-object v1, v0, v3

    sget-object v1, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->PASSIVE:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    aput-object v1, v0, v4

    sget-object v1, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->UNKNOWN:Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    aput-object v1, v0, v5

    sput-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->$VALUES:[Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 66
    const-class v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    return-object v0
.end method

.method public static values()[Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->$VALUES:[Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    invoke-virtual {v0}, [Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/urbanairship/analytics/LocationEvent$AllowableProvider;

    return-object v0
.end method
