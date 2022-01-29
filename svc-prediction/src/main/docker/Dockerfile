FROM openjdk:netcat
RUN mkdir -p /usr/local/prediction
ADD @project.build.finalName@.jar /usr/local/prediction/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
