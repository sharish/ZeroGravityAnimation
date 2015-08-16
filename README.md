# ZeroGravityAnimation 
    
Make random object fly on your screen. 

The library helps in easier development of flying random  objects on random directions (or 
on specific directions) to give  a goodUI experience for the  user. Specifically made  for 
gaming  purpose, thelibrary willbe highly useful  for apps that deals  with space  related 
animations, thus  named as ZeroGravityAnimation. The library  works  with a  class  called
OverTheTopLayer, that makes the object to fly on the top of the screen. A ViewGroup layout 
can be passed optionally that acts as a container for the animating objects.

####Sample:

The image illustrates the stars flying beneath the earth with the help of container layout  while a meteor and 
a satellite flying on the top of screen through OverTheTopLayer.

![zero](https://cloud.githubusercontent.com/assets/13122232/9293135/fdfffd2a-443b-11e5-9710-bdf98e610c37.gif)

####Usage:

```java

int imgResource = R.drawable.star; // your animating object here
int count = 1;  // # of objects to fly
float scale = 0.2f; // scaling factor for the animating objects - value ranges from 0.0 to 1.0

// directions are optional and by default RANDOM will be picked
Direction origin = Direction.LEFT; // animation origin direction - can also use Direction.TOP, Direction.BOTTOM, Direction.LEFT or Direction.RANDOM
Direction destination = Direction.RIGHT; // same case as above for destination


ZeroGravityAnimation animation = new ZeroGravityAnimation();
animation.setCount(count);
animation.setScalingFactor(scale);
animation.setOriginationDirection(origin);
animation.setDestinationDirection(destination);
animation.setImage(resId);
animation.play(this);
  ```
  

#####Animation Listener: 
    Default animation listener can used to collect events of this animation.
````java
animation.setAnimationListener(new Animation.AnimationListener() {
                                           @Override
                                           public void onAnimationStart(Animation animation) {

                                           }

                                           @Override
                                           public void onAnimationEnd(Animation animation) {
                                          
                                           }

                                           @Override
                                           public void onAnimationRepeat(Animation animation) {

                                           }
                                       }
        );
```

#####Animation Object Container Specification:
    Wanted you animation to take place beneath certain views - like the stars that fly beneath Earth in the above demo? Make sure you design your layouts to have a container layout (FrameLayout) that lies below than the original views and use the following code
    
```java
  
  ViewGroup container = (ViewGroup) findViewById(R.id.animation_container_layout); 
  animation.play(this,container);
```

###Apps using this library:
Goldhunt Game|
------------ |
![goldhuntdemo](https://cloud.githubusercontent.com/assets/13122232/9293580/3521f486-444e-11e5-9de2-3b9cab9a13f6.gif)|




Developed By
============

* Harish Sridharan - <harish.sridhar@gmail.com>
  
        
       
        
        
        
      

