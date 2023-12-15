#DRIVE
 - `p` 
	 -  Coefficient Of Friction @ 0.6
		 - 0.05
			 - A little faster, not oscillating
		 - 0.1
			 - Feels fine, not oscillating
		 - 0.2
			 - Feels, fine, not oscillating
		 - 0.5
			 - Starting to wabble, oscillating a bit
		 - 0.25
			 - Better, slight wabble
		 - 0.225
			 - Better, slight wabble but faster at autocorrect, still not perfect though
	  - Coefficient of Friction @ 1
		 - 0.2125
			 - Wheels skipping, no wabble though
	 - Coefficient of Friction @ 2
		 - 0.2125
			 - Still skipping, no wabble
 - `i`
	- Nothing to change, seems like we don't really need to change the i value.
- `d`
	- Coefficient of Friction @ 2 p - 0.2125
		- 1
			- Less control
		- 0.5
			- "Still doesn't feel right" - Head Driver, less control
		- 0.25
			- Feels good, let's take it down a little more
		- 0.125
			- Even better, surprisingly
#ANGLE

Nothing in the #ANGLE section was changed for this tuning session

#CONCLUSION

Seems like a lower `p` value under the #DRIVE section in the `json` files seems to allow it to  drive a lot better. During our testing due to the surface we were driving on, the robot seemed to have been skipping a lot and we found out that it was a result of the actual floor and not the code itself. Great testing!



 
