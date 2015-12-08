.class public final enum Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;
.super Ljava/lang/Enum;
.source "Analytics.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/Analytics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BEACON_PROXIMITY"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

.field public static final enum PROXIMITY_FAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

.field public static final enum PROXIMITY_IMMEDIATE:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

.field public static final enum PROXIMITY_NEAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

.field public static final enum PROXIMITY_UNKNOWN:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    const-string v1, "PROXIMITY_IMMEDIATE"

    invoke-direct {v0, v1, v2, v3}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_IMMEDIATE:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    .line 34
    new-instance v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    const-string v1, "PROXIMITY_NEAR"

    invoke-direct {v0, v1, v3, v4}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_NEAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    .line 35
    new-instance v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    const-string v1, "PROXIMITY_FAR"

    invoke-direct {v0, v1, v4, v5}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_FAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    .line 36
    new-instance v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    const-string v1, "PROXIMITY_UNKNOWN"

    invoke-direct {v0, v1, v5, v2}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_UNKNOWN:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    .line 32
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    sget-object v1, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_IMMEDIATE:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    aput-object v1, v0, v2

    sget-object v1, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_NEAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    aput-object v1, v0, v3

    sget-object v1, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_FAR:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    aput-object v1, v0, v4

    sget-object v1, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->PROXIMITY_UNKNOWN:Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    aput-object v1, v0, v5

    sput-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->$VALUES:[Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "value"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 40
    iput p3, p0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->value:I

    .line 41
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 32
    const-class v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    return-object v0
.end method

.method public static values()[Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->$VALUES:[Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    invoke-virtual {v0}, [Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;

    return-object v0
.end method


# virtual methods
.method protected getValue()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->value:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 49
    sget-object v0, Lcom/adobe/mobile/Analytics$15;->$SwitchMap$com$adobe$mobile$Analytics$BEACON_PROXIMITY:[I

    invoke-virtual {p0}, Lcom/adobe/mobile/Analytics$BEACON_PROXIMITY;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 58
    const-string v0, "0"

    :goto_0
    return-object v0

    .line 51
    :pswitch_0
    const-string v0, "1"

    goto :goto_0

    .line 53
    :pswitch_1
    const-string v0, "2"

    goto :goto_0

    .line 55
    :pswitch_2
    const-string v0, "3"

    goto :goto_0

    .line 49
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
