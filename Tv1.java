class Tv1
{
Speaker speaker;
String name;
Tv1(Speaker speaker,String name)
{
this.speaker=speaker;
this.name=name;
}
void showInfo()
{
System.out.println("Tv relation with speaker: "+speaker);
System.out.println("Tv maxVolume: "+speaker.maxVolume);
System.out.println("Tv name: "+name);

}
}