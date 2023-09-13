import React from "react";
import { View, Text, AppRegistry, StyleSheet } from "react-native";

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "red",
  },
});

const Root = () => {
  return (
    <View>
      <Text style={styles.container}>Root</Text>
    </View>
  );
};

export default Root;

AppRegistry.registerComponent("Root", () => Root);
