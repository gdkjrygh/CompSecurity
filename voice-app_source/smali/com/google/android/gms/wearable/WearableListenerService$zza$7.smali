.class Lcom/google/android/gms/wearable/WearableListenerService$zza$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/WearableListenerService$zza;->zza(Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaTi:Lcom/google/android/gms/wearable/WearableListenerService$zza;

.field final synthetic zzaTn:Lcom/google/android/gms/wearable/zzh;

.field final synthetic zzaTo:Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zza;Lcom/google/android/gms/wearable/zzh;Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$7;->zzaTi:Lcom/google/android/gms/wearable/WearableListenerService$zza;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$7;->zzaTn:Lcom/google/android/gms/wearable/zzh;

    iput-object p3, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$7;->zzaTo:Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$7;->zzaTn:Lcom/google/android/gms/wearable/zzh;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$7;->zzaTo:Lcom/google/android/gms/wearable/internal/AncsNotificationParcelable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/zzh;->zza(Lcom/google/android/gms/wearable/zzb;)V

    return-void
.end method
