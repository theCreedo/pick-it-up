# Pick It Up: Earthack

## Inspiration
Walking around the local neighborhood or downtown city, pieces of trash can be found lying on the ground or in city gutters due to notorious litterbugs. Many of these litterbugs are children under the age of 19 who ignorantly throw away empty water bottles or plastic bags without considering the inherent effect their actions will bring upon the environment, city, and the community they reside in. Fortunately, it's not too late to educate them. We decided to create an app by making community service both a fun and educational task through a simple, well-intentioned game, Pick It Up. 

## What it does
Our app, Pick It Up, provides opportunities to learn about the environmental impacts of littering through factual information, encourages people to take an active role in their community by documenting and cleaning up littered locations in their local area, and promotes environmental conservation through incentivized achievement-based rewards and visualized litter-free frequency. Additionally, it boosts people's fitness as they go out to pick up trash, allowing a digitized 

## How we built it
We built an Android app to present our interactive game. We used Microsoft Cognitive services in order to interpret the images captured in order to determine whether the litter is a water bottle, plastic bag, or other trash. We used google maps to display the location of the user and litter, and cover the maps with grid-like overlays to visualize the level of litter in an area (green, yellow and red). We communicate data for the points through socket.io between the Android App and an AWS hosted web-based server, using node.js. We created an admin terminal interface on the web browser in order to add, remove, and update data.

## Challenges we ran into
One of the biggest challenges faced was figuring out how we wanted data to be represented and communicating that data across multiple platforms (Multiple Android and Web terminal interface). Additionally, we found that there were many scaling limitations that we had with a small simple AWS instance in order to process and manipulate data. Most of all, it took a long time in order to configure the Microsoft's Vision API to work properly.

## Accomplishments that we're proud of
We were able to take litter location data and display it on our map interface. Additionally, as information on litter is updated to the server, we were able to display facts related to Earth day to promote environmental awareness as well as inform about the effects of littering. Most of all, we were able to take in the image input and be able to recognize accurately what type of trash the image was.

## What we learned
- We learned how to communicate between Android phones and a web server using socket.io, as well as provide an admin terminal that could directly edit information and format information.

- We learned how to implement google maps into an android interface with interactive animations and an informative grid-based overlay.

- We learned how to mobilize massive amounts of data, distribute them on multiple platforms, as well as provide a sudo-based terminal for administrators to utilize.

- We learned how to utilize the Microsoft's Vision API in order to interpret data and recognize what to do with it.

## What's next for Pick It Up
Pick It Up has a great amount of potential. With funding, this app can be distributed across the globe, provide monetary rewards or virtual community service hours in order to further incentivize picking up litter. With further time, we can further fine-grain data visualization, provide a better interface for the administrators, amass a database of facts in order to educate students, utilize social accounts for awareness and share achievements, and, all in all, help reduce the amount of littering that adults, children, and future generations of society may produce.
