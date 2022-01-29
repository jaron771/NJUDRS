FROM openjdk:netcat
RUN mkdir -p /usr/local/recommend
ADD @project.build.finalName@.jar /usr/local/recommend/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
